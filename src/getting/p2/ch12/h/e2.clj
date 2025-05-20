;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring and :as

;; a map
(def romeo {:name "Romeo" :age 16 :gender :male})

;; add a new pair to the passed map, based on existing ones
(defn add-greeting [character]
  ;; destructuring in a local binding, to preserve the passed map
  (let [{:keys [name age]} character]
    ;; adding the new pair
    (assoc character :greeting (str "Hello, my name is " name " and I am " age "."))))

;; simplify the code, destructuring and keeping the passed argument by :as
(defn add-greeting [{:keys [name age] :as character}]
  (assoc character :greeting (str "Hello, my name is " name " and I am " age ".")))

(add-greeting romeo)
