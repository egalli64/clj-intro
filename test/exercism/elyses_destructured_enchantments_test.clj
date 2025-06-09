;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Elyses Destructured Enchantments: https://exercism.org/tracks/clojure/exercises/elyses-destructured-enchantments/

(ns exercism.elyses-destructured-enchantments-test
  (:require [clojure.test :refer :all])
  (:require [exercism.elyses-destructured-enchantments :refer :all]))

(deftest test-first-card
  (testing "Given first-card test" (is (= 5 (first-card [5 9 7 1 8])))))

(deftest test-second-card
  (testing "Given second-card test" (is (= 2 (second-card [3 2 10 6 7])))))

(deftest test-swap-top-two-cards
  (testing "Given swap-top-two-cards test" (is (= [7 10 3 8 5] (swap-top-two-cards [10 7 3 8 5])))))

(deftest test-discard-top-card
  (testing "Given discard-top-card test" (is (= [2 [5 4 9 3]] (discard-top-card [2 5 4 9 3])))))

(deftest test-insert-face-cards
  (testing "Given insert-face-cards test" (is (= [5 "jack" "queen" "king" 4 7 10] (insert-face-cards [5 4 7 10]))))
  (testing "Empty insert-face-cards test" (is (= ["jack" "queen" "king"] (insert-face-cards [])))))
