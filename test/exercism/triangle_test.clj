;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Triangle: https://exercism.org/tracks/clojure/exercises/triangle/
(ns exercism.triangle-test
  (:require [clojure.test :refer :all])
  (:require [exercism.triangle :refer [equilateral? isosceles? scalene?]]))

(deftest equilateral?_test_1
  (testing "equilateral triangle ▶ all sides are equal"
    (is (true? (equilateral? 2 2 2)))))

(deftest equilateral?_test_2
  (testing "equilateral triangle ▶ any side is unequal"
    (is (false? (equilateral? 2 3 2)))))

(deftest equilateral?_test_3
  (testing "equilateral triangle ▶ no sides are equal"
    (is (false? (equilateral? 5 4 6)))))

(deftest equilateral?_test_4
  (testing "equilateral triangle ▶ all zero sides is not a triangle"
    (is (false? (equilateral? 0 0 0)))))

(deftest equilateral?_test_5
  (testing "equilateral triangle ▶ sides may be floats"
    (is (true? (equilateral? 0.5 0.5 0.5)))))

(deftest isosceles?_test_1
  (testing "isosceles triangle ▶ last two sides are equal"
    (is (true? (isosceles? 3 4 4)))))

(deftest isosceles?_test_2
  (testing "isosceles triangle ▶ first two sides are equal"
    (is (true? (isosceles? 4 4 3)))))

(deftest isosceles?_test_3
  (testing "isosceles triangle ▶ first and last sides are equal"
    (is (true? (isosceles? 4 3 4)))))

(deftest isosceles?_test_4
  (testing "isosceles triangle ▶ equilateral triangles are also isosceles"
    (is (true? (isosceles? 4 4 4)))))

(deftest isosceles?_test_5
  (testing "isosceles triangle ▶ no sides are equal"
    (is (false? (isosceles? 2 3 4)))))

(deftest isosceles?_test_6
  (testing "isosceles triangle ▶ first triangle inequality violation"
    (is (false? (isosceles? 1 1 3)))))

(deftest isosceles?_test_7
  (testing "isosceles triangle ▶ second triangle inequality violation"
    (is (false? (isosceles? 1 3 1)))))

(deftest isosceles?_test_8
  (testing "isosceles triangle ▶ third triangle inequality violation"
    (is (false? (isosceles? 3 1 1)))))

(deftest isosceles?_test_9
  (testing "isosceles triangle ▶ sides may be floats"
    (is (true? (isosceles? 0.5 0.4 0.5)))))

(deftest scalene?_test_1
  (testing "scalene triangle ▶ no sides are equal"
    (is (true? (scalene? 5 4 6)))))

(deftest scalene?_test_2
  (testing "scalene triangle ▶ all sides are equal"
    (is (false? (scalene? 4 4 4)))))

(deftest scalene?_test_3
  (testing "scalene triangle ▶ first and second sides are equal"
    (is (false? (scalene? 4 4 3)))))

(deftest scalene?_test_4
  (testing "scalene triangle ▶ first and third sides are equal"
    (is (false? (scalene? 3 4 3)))))

(deftest scalene?_test_5
  (testing "scalene triangle ▶ second and third sides are equal"
    (is (false? (scalene? 4 3 3)))))

(deftest scalene?_test_6
  (testing "scalene triangle ▶ may not violate triangle inequality"
    (is (false? (scalene? 7 3 2)))))

(deftest scalene?_test_7
  (testing "scalene triangle ▶ sides may be floats"
    (is (true? (scalene? 0.5 0.4 0.6)))))
