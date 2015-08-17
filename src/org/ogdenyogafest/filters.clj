(ns org.ogdenyogafest.filters
  (require [clojure.string :refer [split lower-case]]
           [org.ogdenyogafest.teachers :refer [teachers-list]]
           [clj-time.core :as t]))

(defn to-thumb
  "Converts an image name to a thumbnale file name by adding
   -thumb before the file extension."
  [img-name]
   (let [[name ext] (split img-name #"[.]")]
     (str name "-thumb." ext)))

(defn get-teacher-name [teacher-id]
  (let [teacher (first (filter #(= (:id %) teacher-id) teachers-list))]
    (-> teacher :name)))

(defn this-year [_]
  (str (t/year (t/now))))
