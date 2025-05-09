;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Recursion: loop recur

(def adjectives ["normal" "small" "big" "swimming"])
(println "A seq:" adjectives)

;; process the input data
(defn make-ish [xs]
  ;; loop recur provides the accumulator, initialized empty
  (loop [xs xs, acc []]
    ;; as before, if the input is empty, return the accumulator
    (if (empty? xs) acc
        ;; otherwise recur (with TCO) on rest, using first
        (recur (rest xs) (conj acc (str (first xs) "ish"))))))

;; start the recursion providing the input seq
(println (make-ish adjectives))
