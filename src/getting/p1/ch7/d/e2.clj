;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; nested let

(let [title "Pride and Prejudice"]
  (println title)
  ;; a nested let could led to confusing behavior (shadowing should be avoided, when possible)
  (let [title "Sense and Sensibility"] (println title))
  (println title))
