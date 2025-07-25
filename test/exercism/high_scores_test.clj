;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; High Scores: https://exercism.org/tracks/clojure/exercises/high-scores/

(ns exercism.high-scores-test
  (:require [clojure.test :refer :all])
  (:require [exercism.high-scores :refer :all]))

(deftest scores_test_1
  (testing "List of scores"
    (is (= '(30 50 20 70) (scores '(30 50 20 70))))))

(deftest latest_test_1
  (testing "Latest score"
    (is (= 30 (latest '(100 0 90 30))))))

(deftest personal-best_test_1
  (testing "Personal best"
    (is (= 100 (personal-best '(40 100 70))))))

(deftest personal-top-three_test_1
  (testing "Top 3 scores ▶ Personal top three from a list of scores"
    (is (= '(100 90 70) (personal-top-three '(10 30 90 30 100 20 10 0 30 40 40 70 70))))))

(deftest personal-top-three_test_2
  (testing "Top 3 scores ▶ Personal top highest to lowest"
    (is (= '(30 20 10) (personal-top-three '(20 10 30))))))

(deftest personal-top-three_test_3
  (testing "Top 3 scores ▶ Personal top when there is a tie"
    (is (= '(40 40 30) (personal-top-three '(40 20 40 30))))))

(deftest personal-top-three_test_4
  (testing "Top 3 scores ▶ Personal top when there are less than 3"
    (is (= '(70 30) (personal-top-three '(30 70))))))

(deftest personal-top-three_test_5
  (testing "Top 3 scores ▶ Personal top when there is only one"
    (is (= '(40) (personal-top-three '(40))))))
