;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Difference of Squares: https://exercism.org/tracks/clojure/exercises/difference-of-squares/
(ns exercism.difference-of-squares-test
  (:require [clojure.test :refer :all])
  (:require [exercism.difference-of-squares :refer :all]))

(deftest square-of-sum_test_1
  (testing "square of sum 1"
    (is (= 1 (square-of-sum 1)))))

(deftest square-of-sum_test_2
  (testing "square of sum 5"
    (is (= 225 (square-of-sum 5)))))

(deftest square-of-sum_test_3
  (testing "square of sum 100"
    (is (= 25502500 (square-of-sum 100)))))

(deftest sum-of-squares_test_1
  (testing "sum of squares 1"
    (is (= 1 (sum-of-squares 1)))))

(deftest sum-of-squares_test_2
  (testing "sum of squares 5"
    (is (= 55 (sum-of-squares 5)))))

(deftest sum-of-squares_test_3
  (testing "sum of squares 100"
    (is (= 338350 (sum-of-squares 100)))))

(deftest difference_test_1
  (testing "difference of squares 1"
    (is (= 0 (difference 1)))))

(deftest difference_test_2
  (testing "difference of squares 5"
    (is (= 170 (difference 5)))))

(deftest difference_test_3
  (testing "difference of squares 100"
    (is (= 25164150 (difference 100)))))
