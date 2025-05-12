;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; some other predicates: number? string? keyword? map? vector?

(number? 1984)
(number? "Anna Karenina")

(string? "Anna Karenina")
(string? 1984)

(keyword? :anna-karenina)
(keyword? "Anna Karenina")

(map? {:title "1984"})
(map? :anna-karenina)

(vector? 1984)
(vector? [1984])
