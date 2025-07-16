;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Scrabble Score: https://exercism.org/tracks/clojure/exercises/scrabble-score/
(ns exercism.scrabble-score-test
  (:require [clojure.test :refer :all])
  (:require [exercism.scrabble-score :refer [score-word]]))

(deftest score-word_test_1
  (testing "lowercase letter"
    (is (= 1 (score-word "a")))))

(deftest score-word_test_2
  (testing "uppercase letter"
    (is (= 1 (score-word "A")))))

(deftest score-word_test_3
  (testing "valuable letter"
    (is (= 4 (score-word "f")))))

(deftest score-word_test_4
  (testing "short word"
    (is (= 2 (score-word "at")))))

(deftest score-word_test_5
  (testing "short, valuable word"
    (is (= 12 (score-word "zoo")))))

(deftest score-word_test_6
  (testing "medium word"
    (is (= 6 (score-word "street")))))

(deftest score-word_test_7
  (testing "medium, valuable word"
    (is (= 22 (score-word "quirky")))))

(deftest score-word_test_8
  (testing "long, mixed-case word"
    (is (= 41 (score-word "OxyphenButazone")))))

(deftest score-word_test_9
  (testing "english-like word"
    (is (= 8 (score-word "pinata")))))

(deftest score-word_test_10
  (testing "empty input"
    (is (= 0 (score-word "")))))

(deftest score-word_test_11
  (testing "entire alphabet available"
    (is (= 87 (score-word "abcdefghijklmnopqrstuvwxyz")))))
