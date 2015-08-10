(ns org.ogdenyogafest.routes
  (:require [selmer.parser :refer [render-file set-resource-path!]]
            [selmer.filters :refer [add-filter!]]
            [clojure.string :refer [capitalize split join]]
            [org.ogdenyogafest.schedule :refer [full-schedule
                                                days]]
            [org.ogdenyogafest.teachers :refer [teachers-list]]
            [org.ogdenyogafest.filters :refer :all]
            [org.ogdenyogafest.contactus :as contact-us]
            [ring.util.anti-forgery :refer [anti-forgery-field]]))


(set-resource-path! (clojure.java.io/resource "templates"))
(add-filter! :thumb to-thumb)
(add-filter! :web-name to-web-name)
(add-filter! :this-year this-year)


(defn- format-schedule
  "Format the schedule to group classes together in time blocks."
  [schedule]
  (loop [sched schedule grouped [] time-block ""]
    (if (seq sched)
      (let [row (first sched)
            row-time (:time row)
            new-row (if (= row-time time-block)
                      (assoc row :time "")
                      row)]
        (recur (rest sched) (conj grouped new-row) row-time))
      grouped)))


(defn- color-groups
  "Alternates the row color for each time group."
  [grouped-schedule]
  (def color "white")
  (loop [gs grouped-schedule colored [] color-group false]
    (if (seq gs)
      (let [row (first gs)
            color-row (if (empty? (:time row))
                        color-group
                        (not color-group))
            new-row (if color-row
                      (assoc row :row-color color)
                      (assoc row :row-color "grey"))]
        (recur (rest gs) (conj colored new-row) color-row))
      colored)))


(defn- capitalize-hyphenated-name
  "Takes a hyphenated name and capitalizes each name"
  [name]
  (join "-" (->> (split name #"-") (map capitalize))))


(defn- from-web-name
  "Converts a web name to a proper format with capital letters"
  [web-name]
  (let [[fname lname] (->
                       web-name
                       (split #"_"))]
    (str (capitalize fname) " " (capitalize-hyphenated-name lname))))


(defn render-home []
  (render-file "index.html" {:page-name "Home"}))


(defn render-404 []
  (render-file "404.html" {:page-name "Page not found"}))


(defn render-schedule []
  (let [day-1-schedule (filter #(= (:day %) :day-1) full-schedule)
        day-2-schedule (filter #(= (:day %) :day-2) full-schedule)]
    (render-file "schedule.html"
                 {:page-name "Schedule"
                  :day-1-classes (->
                                  (format-schedule day-1-schedule)
                                  (color-groups))
                  :day-2-classes (->
                                  (format-schedule day-2-schedule)
                                  (color-groups))
                  :day-1 (:day-1 days)
                  :day-2 (:day-2 days)})))


(defn render-teachers []
  (render-file "teachers.html" {:page-name "Teachers"
                                :teachers (sort-by :name teachers-list)}))


(defn render-teacher [teacher-name]
  (let [proper-teacher-name (from-web-name teacher-name)
        teacher (first (filter #(= (:name %) proper-teacher-name) teachers-list))
        classes (->>
                 full-schedule
                 (filter #(= (:teacher %) proper-teacher-name))
                 (map #(assoc % :day (get days (:day %)))))]
    (render-file "teacher.html" {:page-name proper-teacher-name
                                 :teacher teacher
                                 :classes classes})))


(defn render-tickets []
  (render-file "tickets.html" {:page-name "Tickets"
                               :day-1 (:day-1 days)
                               :day-2 (:day-2 days)}))


(def contact-us-options ["Information" "Vendor" "Volunteer"])

(defn render-contact-us []
  (render-file "contact-us.html" {:page-name "Contact Us"
                                  :interest "Information"
                                  :options contact-us-options
                                  :csrf-token (anti-forgery-field)}))


(defn render-vendor-contact-us []
  (render-file "contact-us.html" {:page-name "Vendor Contact Us"
                                  :interest "Vendor"
                                  :options contact-us-options
                                  :csrf-token (anti-forgery-field)}))


(defn render-volunteer-contact-us []
  (render-file "contact-us.html" {:page-name "Volunteer Contact Us"
                                  :interest "Volunteer"
                                  :options contact-us-options
                                  :csrf-token (anti-forgery-field)}))


(defn render-contact-us-thank-you []
  (render-file "contact-us-thank-you.html" {:page-name "Thank you"}))


(defn process-contact-us [name email comments]
  (if-let [errors (seq (contact-us/validate name email comments))]
    (render-file "contact-us.html" {:page-name "Contact Us"
                                    :csrf-token (anti-forgery-field)
                                    :errors errors})
    (do
      (contact-us/send-email "contactus@ogdenyogafest.org"
                             "rinoa29@gmail.com"
                             "Ogden Yoga Fest - Contact Us"
                             (contact-us/build-message name email comments))
      (render-contact-us-thank-you))))


(defn render-lodging []
  (render-file "lodging.html" {:page-name "Lodging" }))


(defn render-location []
  (render-file "location.html" {:page-name "Location" }))


(defn render-contribute []
  (render-file "contribute.html" {:page-name "Contribute"}))


(defn render-be-a-vendor []
  (render-file "be-a-vendor.html" {:page-name "Be a Vendor" }))


(defn render-volunteer []
  (render-file "volunteer.html" {:page-name "Volunteer" }))
