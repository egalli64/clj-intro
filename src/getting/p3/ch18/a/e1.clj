;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; atom: swap!, deref (or @)
(ns getting.p3.ch18.a.e1)

;; create an atom object initialized to zero
(def counter (atom 0))

(defn greeting [plain]
  (if plain
    ;; change the value in the atom associated to the var by increasing it
    (swap! counter inc)
    ;; change the atom adding 12 to it
    (swap! counter + 12))

  ;; deference the atom by @
  (if (= (mod @counter 2) 0)
    ;; deference the atom by deref
    (str "Congrats! You are an even (" (deref counter) ") visitor!")
    (str "Welcome!")))

(defn -main []
  (println (greeting true))
  (println (greeting true))
  (println (greeting false)))
