;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Resistor Color Duo: https://exercism.org/tracks/clojure/exercises/resistor-color-duo/
(ns exercism.resistor-color-duo-test
  (:require [clojure.test :refer :all])
  (:require [exercism.resistor-color-duo :refer [resistor-value]]))

(deftest resistor-value_test_1
  (testing "Brown and black"
    (is (= 10 (resistor-value ["brown" "black"])))))

(deftest resistor-value_test_2
  (testing "Blue and grey"
    (is (= 68 (resistor-value ["blue" "grey"])))))

(deftest resistor-value_test_3
  (testing "Yellow and violet"
    (is (= 47 (resistor-value ["yellow" "violet"])))))

(deftest resistor-value_test_4
  (testing "White and red"
    (is (= 92 (resistor-value ["white" "red"])))))

(deftest resistor-value_test_5
  (testing "Orange and orange"
    (is (= 33 (resistor-value ["orange" "orange"])))))

(deftest resistor-value_test_6
  (testing "Ignore additional colors"
    (is (= 51 (resistor-value ["green" "brown" "orange"])))))

(deftest resistor-value_test_7
  (testing "Black and brown, one-digit"
    (is (= 1 (resistor-value ["black" "brown"])))))
