;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Adapted for using deps.edn instead of Leiningen
;;
;; Using the external library camel-snake-kebab https://clojars.org/camel-snake-kebab

(ns living.ch5.e3
  (:require [camel-snake-kebab.core :as csk]))

(defn serpent-talk [input]
  (str "Serpent! You said: " (csk/->snake_case input)))

(defn -main [& args]
  (let [arg (first args)]
    (if arg
      (do (println (csk/->snake_case arg)) (println (serpent-talk arg)))
      (println "Please, pass me one (just one) argument ..."))))
