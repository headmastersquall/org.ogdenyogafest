(ns org.ogdenyogafest.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.params :refer [wrap-params]]
            [org.ogdenyogafest.routes :as r]))

(defroutes app-routes
  (GET "/" [] (r/render-home))
  (GET "/schedule" [] (r/render-schedule))
  (GET "/teachers" [] (r/render-teachers))
  (GET "/teacher/:teacher-id" [teacher-id] (r/render-teacher teacher-id))
  (GET "/tickets" [] (r/render-tickets))
  (GET "/contact-us" [] (r/render-contact-us))
  (GET "/vendor-contact-us" [] (r/render-vendor-contact-us))
  (GET "/volunteer-contact-us" [] (r/render-volunteer-contact-us))
  (POST "/send-contact-us-email" [name email interest comments]
        (r/process-contact-us name email interest comments))
  (GET "/contact-us-thank-you" [] (r/render-contact-us-thank-you))
  (GET "/lodging" [] (r/render-lodging))
  (GET "/location" [] (r/render-location))
  (GET "/contribute" [] (r/render-contribute))
  (GET "/be-a-vendor" [] (r/render-be-a-vendor))
  (GET "/volunteer" [] (r/render-volunteer))
  (route/not-found (r/render-404)))

(def app
  (-> app-routes
      (wrap-defaults site-defaults)
      (wrap-params)))
