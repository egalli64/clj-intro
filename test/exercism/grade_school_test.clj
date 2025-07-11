;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Grade School: https://exercism.org/tracks/clojure/exercises/grade-school/
(ns exercism.grade-school-test
  (:require [clojure.test :refer :all]
            [exercism.grade-school :as gs]))

(deftest add-student
  (is (= {2 ["Aimee"]} (gs/add {} "Aimee" 2))))

(deftest add-more-students-in-same-class
  (is (= {2 ["James", "Blair", "Paul"]}
         (-> {} (gs/add "James" 2) (gs/add "Blair" 2) (gs/add "Paul" 2)))))

(deftest add-students-to-different-grades
  (is (= {3 ["Chelsea"] 7 ["Logan"]}
         (-> {} (gs/add "Chelsea" 3) (gs/add "Logan" 7)))))

(deftest get-students-in-a-grade
  (is (= ["Franklin", "Bradley"]
         (-> {}
             (gs/add "Franklin" 5) (gs/add "Bradley" 5) (gs/add "Jeff" 1)
             (gs/grade 5)))))

(deftest get-students-in-a-non-existent-grade
  (is (= [] (gs/grade {} 1))))

(deftest sorted-grade-school
  (is (= (sorted-map 3 ["Kyle"], 4 ["Christopher" "Jennifer"], 6 ["Kareem"])
         (-> {}
             (gs/add "Jennifer" 4) (gs/add "Kareem" 6) (gs/add "Christopher" 4) (gs/add "Kyle" 3)
             (gs/sorted)))))

(deftest sorted-grade_school-keys-sorted
  (is (= [3 4 6]
         (-> {}
             (gs/add "Jennifer" 4) (gs/add "Kareem" 6) (gs/add "Christopher" 4) (gs/add "Kyle" 3)
             (gs/sorted) (keys)))))
