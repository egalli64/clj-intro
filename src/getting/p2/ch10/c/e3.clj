;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; partition, partition-all

(def titles-and-authors ["Jaws" "Benchley" "2001" "Clarke" "Dracula" "Stoker"])
;; create a seq of subseq's sized 2
(partition 2 titles-and-authors)

(def plus-1 (conj titles-and-authors "Whatever"))
(println plus-1)
;; the last subseq is lost if incomplete
(partition 2 plus-1)

;; keep the last subseq even if incomplete
(partition-all 2 plus-1)
