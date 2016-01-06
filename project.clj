(defproject org.tinnitus.dl/elastic-riemann "0.1.2-SNAPSHOT"
  :description "A plugin for using ElasticSearch 2.x and Kibana with Riemann 0.2.10"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [clojurewerkz/elastisch "2.2.0"  :exclusions [[clj-http] [cheshire]]]]
  :profiles {:provided
             {:dependencies
              [[riemann "0.2.10"]]}})