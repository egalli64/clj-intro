;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring map with :keys

;; a map
(def romeo {:name "Romeo" :age 16 :gender :male})

;; destructuring a map "by hand"
(defn character-desc [{name :name age :age gender :gender}]
  (str "Name: " name " age: " age " gender: " gender))

;; same, simplified by :keys
(defn character-desc [{:keys [name age gender]}]
  (str "Name: " name " age: " age " gender: " gender))

;; same, mixing :keys with use of a custom symbol
(defn character-desc [{:keys [name gender] age-in-years :age}]
  (str "Name: " name " age: " age-in-years " gender: " gender))

(character-desc romeo)
