(defproject weatherMan "1.0.0-SNAPSHOT"
  :description "A basic weather app"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]]
  :min-lein-version "2.0.0"
  :main weatherMan.core)
