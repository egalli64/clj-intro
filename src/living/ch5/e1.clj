;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Using deps.edn as configuration
;; Read Living Clojure by Carin Meier if you want to use Leiningen instead
;;
;; Which Clojure              :deps {org.clojure/clojure {:mvn/version "1.12.0"}
;; Where is the source code   :paths ["src"]
;; the app is run as usual, in the project root with "clj -M -m living.ch5.e1"

(ns living.ch5.e1)

(defn -main [] (println "Hello, World!"))
