(ns org.ogdenyogafest.jetty
  (:require [org.ogdenyogafest.handler :refer [app]]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn -main []
  (run-jetty #'app {:port 80}))
