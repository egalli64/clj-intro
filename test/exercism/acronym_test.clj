;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Acronym: https://exercism.org/tracks/clojure/exercises/acronym/
(ns exercism.acronym-test
  (:require [clojure.test :refer :all]
            [exercism.acronym :refer [acronym]]))

(deftest acronym_test_1
  (testing "basic"
    (is (= "PNG" (acronym "Portable Network Graphics")))))

(deftest acronym_test_2
  (testing "lowercase words"
    (is (= "ROR" (acronym "Ruby on Rails")))))

(deftest acronym_test_3
  (testing "punctuation"
    (is (= "FIFO" (acronym "First In, First Out")))))

(deftest acronym_test_4
  (testing "all caps word"
    (is (= "GIMP" (acronym "GNU Image Manipulation Program")))))

(deftest acronym_test_5
  (testing "punctuation without whitespace"
    (is (= "CMOS" (acronym "Complementary metal-oxide semiconductor")))))

(deftest acronym_test_6
  (testing "very long abbreviation"
    (is (= "ROTFLSHTMDCOALM" (acronym "Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me")))))

(deftest acronym_test_7
  (testing "consecutive delimiters"
    (is (= "SIMUFTA" (acronym "Something - I made up from thin air")))))

(deftest acronym_test_8
  (testing "apostrophes"
    (is (= "HC" (acronym "Halley's Comet")))))

(deftest acronym_test_9
  (testing "underscore emphasis"
    (is (= "TRNT" (acronym "The Road _Not_ Taken")))))

(deftest extra
  (testing "empty" (is (= "" (acronym ""))))
  (testing "separators" (is (= "" (acronym "  - _ ")))))