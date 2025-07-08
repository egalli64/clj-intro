;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Bank Account: https://exercism.org/tracks/clojure/exercises/bank-account/
(ns exercism.bank-account)

(def ^:private accounts (atom {}))

(defn open-account [] (let [id (random-uuid)] (swap! accounts assoc id 0) id))

(defn close-account [id] (swap! accounts dissoc id))

(defn get-balance [id] (get @accounts id))

(defn update-balance [id delta] (swap! accounts update id #(+ % delta)))
