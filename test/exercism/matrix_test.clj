;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;;
;;;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;;;
;;;; Matrix: https://exercism.org/tracks/clojure/exercises/matrix/
(ns exercism.matrix-test
  (:require [clojure.test :refer :all]
            [exercism.matrix :refer [get-row get-column]]))

(deftest get-row_test_1
  (testing "extract row from one number matrix"
    (is (= [1] (get-row "1" 1)))))

(deftest get-row_test_2
  (testing "can extract row"
    (is (= [3 4] (get-row "1 2\n3 4" 2)))))

(deftest get-row_test_3
  (testing "extract row where numbers have different widths"
    (is (= [10 20] (get-row "1 2\n10 20" 2)))))

(deftest get-row_test_4
  (testing "can extract row from non-square matrix with no corresponding column"
    (is (= [8 7 6] (get-row "1 2 3\n4 5 6\n7 8 9\n8 7 6" 4)))))

(deftest get-column_test_1
  (testing "extract column from one number matrix"
    (is (= [1] (get-column "1" 1)))))

(deftest get-column_test_2
  (testing "can extract column"
    (is (= [3 6 9] (get-column "1 2 3\n4 5 6\n7 8 9" 3)))))

(deftest get-column_test_3
  (testing "can extract column from non-square matrix with no corresponding row"
    (is (= [4 8 6] (get-column "1 2 3 4\n5 6 7 8\n9 8 7 6" 4)))))

(deftest get-column_test_4
  (testing "extract column where numbers have different widths"
    (is (= [1903 3 4] (get-column "89 1903 3\n18 3 1\n9 4 800" 2)))))
