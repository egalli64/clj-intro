;;; For more info read Living Clojure by Carin Meier
;; Polymorphism: multimethods by defmulti and defmethod

;; a multimethod with a single argument
(defmulti process class)

(defmethod process java.lang.String [input]
  (str "Processing string: " input))

(defmethod process clojure.lang.Keyword [input]
  (str "Processing keyword: " input))

(defmethod process java.lang.Long [input]
  (str "Processing long: " input))

;; comment out the default method to make the code unreliable
(defmethod process :default [input]
  (str "Processing an unknown object: " input))

;; test the multimethods
(let [mixed-bag ["hello" 123 :keyword 'symbol []]]
  (doseq [item mixed-bag]
    ;; if no :default defmethod available, we could have an Exception
    (try
      (println (process item))
      (catch IllegalArgumentException e (println (.getMessage e))))))
