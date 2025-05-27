;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; solution to the previous problem using a macro

(defmacro arithmetic-if [n pos zero neg]
  (list 'cond (list 'pos? n) pos
        (list 'zero? n) zero
        :else neg))

(arithmetic-if 0 :loved-it :meh :hated-it)
