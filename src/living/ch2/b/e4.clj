;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Destructuring maps

(def users {:a "Tom", :b "Bob"})
(println "A map:" users)

;; destructuring values in a map in local bindings
(let [{a :a b :b} users] (println "The users are" a b))

;; default value by :or
(let [{a :a b :b c :c :or {c "missing"}} users] (println "The users are" a b c))

;; keeping the original by :as
(let [{a :a b :b :as original} users] (println "The users are" a b "from" original))

;; :keys directive
(let [{:keys [a b]} users] (println "The users are" a b))
