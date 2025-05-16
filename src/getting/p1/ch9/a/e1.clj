;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a namespace is lookup table for vars, indexed by symbol
;; create/switch namespace by ns

;; this var is put in the default namespace (user)
(def discount-rate 0.05)

;; create a namespace with the specified name - it should be unique
;; as per naming conventions, in a Clojure project the namespace is expected to match the source relative filename
(ns pricing)

;; each def acts on the current namespace (pricing)
(def discount-rate 0.15)
(defn discount-price [book] (* (- 1.0 discount-rate) (:price book)))

;; since user namespace is already existing, ns just makes it the current one
(ns user)
;; it "sees" the vars in user
(println discount-rate)

;; move back to pricing namespace
(ns pricing)
;; all the vars in it are preserved
(println (discount-price {:title "Emma" :price 9.99}))

;; move again in user
(ns user)
;; using the fully qualified name of a var to access it from another namespace
(println (pricing/discount-price {:title "Emma" :price 9.99}))
