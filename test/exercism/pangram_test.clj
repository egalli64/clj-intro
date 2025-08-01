;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Pangram: https://exercism.org/tracks/clojure/exercises/pangram/
(ns exercism.pangram-test
  (:require [clojure.test :refer :all])
  (:require [exercism.pangram :refer [pangram?]]))

(deftest pangram?_test_1
  (testing "empty sentence"
    (is (false? (pangram? "")))))

(deftest pangram?_test_2
  (testing "perfect lower case"
    (is (true? (pangram? "abcdefghijklmnopqrstuvwxyz")))))

(deftest pangram?_test_3
  (testing "only lower case"
    (is (true? (pangram? "the quick brown fox jumps over the lazy dog")))))

(deftest pangram?_test_4
  (testing "missing the letter 'x'"
    (is (false? (pangram? "a quick movement of the enemy will jeopardize five gunboats")))))

(deftest pangram?_test_5
  (testing "missing the letter 'h'"
    (is (false? (pangram? "five boxing wizards jump quickly at it")))))

(deftest pangram?_test_6
  (testing "with underscores"
    (is (true? (pangram? "the_quick_brown_fox_jumps_over_the_lazy_dog")))))

(deftest pangram?_test_7
  (testing "with numbers"
    (is (true? (pangram? "the 1 quick brown fox jumps over the 2 lazy dogs")))))

(deftest pangram?_test_8
  (testing "missing letters replaced by numbers"
    (is (false? (pangram? "7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog")))))

(deftest pangram?_test_9
  (testing "mixed case and punctuation"
    (is (true? (pangram? "\"Five quacking Zephyrs jolt my wax bed.\"")))))

(deftest pangram?_test_10
  (testing "a-m and A-M are 26 different characters but not a pangram"
    (is (false? (pangram? "abcdefghijklm ABCDEFGHIJKLM")))))
