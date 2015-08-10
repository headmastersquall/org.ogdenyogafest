(ns org.ogdenyogafest.filters
  (require [clojure.string :refer [split lower-case]]
           [clj-time.core :as t]))

(defn to-thumb
  "Converts an image name to a thumbnale file name by adding
   -thumb before the file extension."
  [img-name]
   (let [[name ext] (split img-name #"[.]")]
     (str name "-thumb." ext)))

(defn to-web-name
  "Converts a name to a web friendly format so it can be used in links"
  [full-name]
   (let [[fname lname] (->
                        full-name
                        lower-case
                        (split #" "))]
     (str fname "_" lname)))

(defn this-year [_]
  (str (t/year (t/now))))
