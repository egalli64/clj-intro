;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Keyword

;; a literal Keyword
(type :keyword)
(println :keyword)

;; same, but using the constructor function keyword
(type (keyword "keyword"))
(keyword "keyword")

;; idiomatically used as key in a map
(def my-map {:a 1, :b 2, :c 3})
(println my-map)

;;
;; keywords can be namespaced - usually not Clojure namespace, they are meant to better describe the keyword use
(println :product/id)
(println :account/id)

;;
;; special syntax to put a keyword in the current namespace
(println ::id)

(if (= (ns-name *ns*) 'user)
  ;; here the keyword namespace is the Clojure namespace
  (let [id-1 ::id, id-2 :user/id] (identical? id-1 id-2))
  (println "I expected you were in the user namespace"))
