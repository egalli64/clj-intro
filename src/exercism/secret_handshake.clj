;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Secret Handshake: https://exercism.org/tracks/clojure/exercises/secret-handshake/
(ns exercism.secret-handshake)

(def actions ["wink" "double blink" "close your eyes" "jump"])

(defn commands [x]
  (let [action-bits (bit-and x 2r01111)]
    (->> actions
         (keep-indexed (fn [i action] (when (bit-test action-bits i) action)))
         (#(if (bit-test x 4) (reverse %) %)))))
