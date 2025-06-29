;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Resistor Color: https://exercism.org/tracks/clojure/exercises/resistor-color/
(ns exercism.resistor-color-test
  (:require [clojure.test :refer :all])
  (:require [exercism.resistor-color :refer [color-code colors]]))

(deftest colors_test_1
  (testing "Colors"
    (is (= ["black" "brown" "red" "orange" "yellow" "green" "blue" "violet" "grey" "white"] colors))))

(deftest color-code_test_1
  (testing "Color codes ▶ Black"
    (is (= 0 (color-code "black")))))

(deftest color-code_test_2
  (testing "Color codes ▶ White"
    (is (= 9 (color-code "white")))))

(deftest color-code_test_3
  (testing "Color codes ▶ Orange"
    (is (= 3 (color-code "orange")))))
