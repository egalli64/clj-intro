;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Grade School: https://exercism.org/tracks/clojure/exercises/grade-school/
(ns exercism.grade-school)

;; extract the vector of students with the given grade, or give a default empty vector
(defn grade [school grade]
  (school grade []))

;; add [grade name] to the school map
;; add the student to the class, if not already in
;; create a new vector for the first student for a grade
(defn add [school name grade]
  (update school grade
          (fn [grade-class]
            (if grade-class
              (if (some #(= % name) grade-class) grade-class (conj grade-class name))
              [name]))))


;; convert the passed school in a sorted-map grade -> vector of students
(defn sorted [school]
  (into (sorted-map) (map (fn [[grade names]] [grade (sort names)]) school)))
