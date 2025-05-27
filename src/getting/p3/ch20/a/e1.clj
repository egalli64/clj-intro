;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; no macro in here

;; a function discriminating on its input
(defn print-rating [rating]
  (cond (pos? rating) (println "Good book!")
        (zero? rating) (println "Totally indifferent.")
        :else (println "Run away!")))

(print-rating 42)
(print-rating 0)
(print-rating -23)

;; similar, but the caller provides the feedback
(defn arithmetic-if [n pos zero neg]
  (cond (pos? n) pos
        (zero? n) zero
        (neg? n) neg))

(arithmetic-if 0 :great :meh :boring)

;; try to rewrite the original function
(defn print-rating [rating]
  (arithmetic-if rating (println "Good book!") (println "Totally indifferent.") (println "Run away!")))

;; surprising effect
;; the arguments are evaluated before being passed to the called function!
(print-rating 10)

;; fix
;; accepting functions as arguments
(defn arithmetic-if-v2 [n pos-f zero-f neg-f]
  (cond
    (pos? n) (pos-f)
    (zero? n) (zero-f)
    (neg? n) (neg-f)))

;; passing anon functions
(defn print-rating [rating]
  (arithmetic-if-v2 rating #(println "Good book!") #(println "Totally indifferent.") #(println "Run away!")))
(print-rating 10)
