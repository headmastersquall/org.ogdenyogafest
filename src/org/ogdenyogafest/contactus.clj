(ns org.ogdenyogafest.contactus
  (:require [postal.core :refer [send-message]]
            [environ.core :refer [env]]))

(defn send-email [from to subject body]
  (send-message
    {:user (env :email-username)
     :pass (env :email-password)
     :host "smtp.gmail.com"
     :ssl :yes!!!11}
    {:from from
     :to   to
     :subject subject
     :body body
     :port "465"}))


(defn- require-field [value message errors]
  (if (empty? value)
    (conj errors message)
    errors))


(defn- require-email [email message errors]
  (if (re-seq #"^[^@]+@[a-zA-Z0-9]+[.][a-zA-Z]{2,}$" email)
    errors
    (conj errors message)))


(defn validate [name email comments]
  (->> []
       (require-field name "Name is required")
       (require-email email "Email is invalid")
       (require-field comments "Please provide a comment")))


(defn build-message [name email interest comments]
  (let [nl "\r\n"]
    (str "The following information was submitted:" nl
         nl
         "Name: " name nl
         "Email: " email nl
         "Interested in: " interest nl
         "Comments: " comments nl)))

