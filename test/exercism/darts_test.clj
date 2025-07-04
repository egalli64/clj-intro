;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Two Fer: https://exercism.org/tracks/clojure/exercises/two-fer/
(ns exercism.darts-test
  (:require [clojure.test :refer :all])
  (:require [exercism.darts :refer [score]]))

(deftest score_test_1
  (testing "Missed target"
    (is (= 0 (score -9 9)))))

(deftest score_test_2
  (testing "On the outer circle"
    (is (= 1 (score 0 10)))))

(deftest score_test_3
  (testing "On the middle circle"
    (is (= 5 (score -5 0)))))

(deftest score_test_4
  (testing "On the inner circle"
    (is (= 10 (score 0 -1)))))

(deftest score_test_5
  (testing "Exactly on center"
    (is (= 10 (score 0 0)))))

(deftest score_test_6
  (testing "Near the center"
    (is (= 10 (score -0.1 -0.1)))))

(deftest score_test_7
  (testing "Just within the inner circle"
    (is (= 10 (score 0.7 0.7)))))

(deftest score_test_8
  (testing "Just outside the inner circle"
    (is (= 5 (score 0.8 -0.8)))))

(deftest score_test_9
  (testing "Just within the middle circle"
    (is (= 5 (score -3.5 3.5)))))

(deftest score_test_10
  (testing "Just outside the middle circle"
    (is (= 1 (score -3.6 -3.6)))))

(deftest score_test_11
  (testing "Just within the outer circle"
    (is (= 1 (score -7.0 7.0)))))

(deftest score_test_12
  (testing "Just outside the outer circle"
    (is (= 0 (score 7.1 -7.1)))))

(deftest score_test_13
  (testing "Asymmetric position between the inner and middle circles"
    (is (= 5 (score 0.5 -4)))))
