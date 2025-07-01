;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; ETL: https://exercism.org/tracks/clojure/exercises/etl/
(ns exercism.etl)

;; transform the source data, as described by the test
(defn transform [source]
  ;; for comprehension: consider each pair key/values extracted from source
  ;;                    extract each value from values
  ;; each pair key/value to be inserted into the result map is done by:
  ;;                    each original value, converted to lowercase, and the relative original key
  (into {} (for [[key values] source value values] [(.toLowerCase value) key])))