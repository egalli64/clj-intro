;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Reverse String: https://exercism.org/tracks/clojure/exercises/reverse-string/
(ns exercism.reverse-string-test
  (:require [clojure.test :refer :all])
  (:require [exercism.reverse-string :refer [reverse-string]]))


(deftest reverse-string_test_1
  (testing "an empty string"
    (is (= "" (reverse-string "")))))

(deftest reverse-string_test_2
  (testing "a word"
    (is (= "tobor" (reverse-string "robot")))))

(deftest reverse-string_test_3
  (testing "a capitalized word"
    (is (= "nemaR" (reverse-string "Ramen")))))

(deftest reverse-string_test_4
  (testing "a sentence with punctuation"
    (is (= "!yrgnuh m'I" (reverse-string "I'm hungry!")))))

(deftest reverse-string_test_5
  (testing "a palindrome"
    (is (= "racecar" (reverse-string "racecar")))))

(deftest reverse-string_test_6
  (testing "an even-sized word"
    (is (= "reward" (reverse-string "drawer")))))

(deftest reverse-string_test_7
  (testing "wide characters"
    (is (= "猫子" (reverse-string "子猫")))))
