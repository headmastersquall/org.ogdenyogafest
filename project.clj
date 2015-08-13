(defproject org.ogdenyogafest "0.1.0-SNAPSHOT"
  :description "Main web site for the anual Ogden Yoga Festival"
  :url "http://ogdenyogafest.org"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [selmer "0.8.2"]
                 [ring/ring-defaults "0.1.2"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [com.draines/postal "1.11.3"]
                 [clj-time "0.9.0"]
                 [environ "1.0.0"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-environ "1.0.0"]]
  :ring {:handler org.ogdenyogafest.handler/app}
  :main org.ogdenyogafest.jetty
  :aot [org.ogdenyogafest.jetty]
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
