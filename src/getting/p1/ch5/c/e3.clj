;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; another example with a dispatch function

(ns getting.p1.ch5.c.e3)

(defn dispatch-published [book]
  (cond (< (:published book) 1928) :public-domain
        (< (:published book) 1978) :old-copyright
        :else :new-copyright))

(defmulti compute-royalties dispatch-published)

(defmethod compute-royalties :public-domain [_] 0)
(defmethod compute-royalties :old-copyright [book] (* 0.12 (:price book)))
(defmethod compute-royalties :new-copyright [book] (* 0.15 (:price book)))

(defn -main []
  (println (compute-royalties {:title "An old book" :published 1884 :price 10.0}))
  (println (compute-royalties {:title "An oldish book" :published 1950 :price 10.0}))
  (println (compute-royalties {:title "A recent book" :published 1999 :price 10.0})))
