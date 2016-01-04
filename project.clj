(defproject org.tinnitus.dl/elastic-riemann "0.1.1-SNAPSHOT"
  :description "A plugin for using ElasticSearch and Kibana with Riemann"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.cli "0.2.1"]
                 [clj-logging-config "1.9.6"]
                 [clojurewerkz/elastisch "2.2.0"]]
  :profiles {:provided
             {:dependencies
              [[riemann "0.2.10" :exclusions [joda-time org.slf4j/slf4j-log4j12]]]}})
  
