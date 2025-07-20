;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Pascal's Triangle: https://exercism.org/tracks/clojure/exercises/pascals-triangle/
(ns exercism.pascals-triangle-test
  (:require [clojure.test :refer :all]
            [exercism.pascals-triangle :refer [row triangle]]))

(deftest zero-rows
  (testing "Zero rows"
    (is (= []
           (take 0 triangle)))))

(deftest single-row
  (testing "Single row"
    (is (= [[1]]
           (take 1 triangle)))))

(deftest two-rows
  (testing "Two rows"
    (is (= [[1]
            [1 1]]
           (take 2 triangle)))))

(deftest three-rows
  (testing "Three rows"
    (is (= [[1]
            [1 1]
            [1 2 1]]
           (take 3 triangle)))))

(deftest four-rows
  (testing "Four rows"
    (is (= [[1]
            [1 1]
            [1 2 1]
            [1 3 3 1]]
           (take 4 triangle)))))

(deftest five-rows
  (testing "Five rows"
    (is (= [[1]
            [1 1]
            [1 2 1]
            [1 3 3 1]
            [1 4 6 4 1]]
           (take 5 triangle)))))

(deftest six-rows
  (testing "Six rows"
    (is (= [[1]
            [1 1]
            [1 2 1]
            [1 3 3 1]
            [1 4 6 4 1]
            [1 5 10 10 5 1]]
           (take 6 triangle)))))

(deftest ten-rows
  (testing "Ten rows"
    (is (= [[1]
            [1 1]
            [1 2 1]
            [1 3 3 1]
            [1 4 6 4 1]
            [1 5 10 10 5 1]
            [1 6 15 20 15 6 1]
            [1 7 21 35 35 21 7 1]
            [1 8 28 56 70 56 28 8 1]
            [1 9 36 84 126 126 84 36 9 1]]
           (take 10 triangle))))

  (testing "Ten rows - by row function"
    (is (= [[1]
            [1 1]
            [1 2 1]
            [1 3 3 1]
            [1 4 6 4 1]
            [1 5 10 10 5 1]
            [1 6 15 20 15 6 1]
            [1 7 21 35 35 21 7 1]
            [1 8 28 56 70 56 28 8 1]
            [1 9 36 84 126 126 84 36 9 1]]
           (row 10))))
  )
