;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Perfect Numbers: https://exercism.org/tracks/clojure/exercises/perfect-numbers/

(ns exercism.perfect-numbers-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercism.perfect-numbers :refer [classify]]))

(deftest classify_test_1
  (testing "Perfect numbers ▶ Smallest perfect number is classified correctly"
    (is (= :perfect (classify 6)))))

(deftest classify_test_2
  (testing "Perfect numbers ▶ Medium perfect number is classified correctly"
    (is (= :perfect (classify 28)))))

(deftest classify_test_3
  (testing "Perfect numbers ▶ Large perfect number is classified correctly"
    (is (= :perfect (classify 33550336)))))

(deftest classify_test_4
  (testing "Abundant numbers ▶ Smallest abundant number is classified correctly"
    (is (= :abundant (classify 12)))))

(deftest classify_test_5
  (testing "Abundant numbers ▶ Medium abundant number is classified correctly"
    (is (= :abundant (classify 30)))))

(deftest classify_test_6
  (testing "Abundant numbers ▶ Large abundant number is classified correctly"
    (is (= :abundant (classify 33550335)))))

(deftest classify_test_7
  (testing "Deficient numbers ▶ Smallest prime deficient number is classified correctly"
    (is (= :deficient (classify 2)))))

(deftest classify_test_8
  (testing "Deficient numbers ▶ Smallest non-prime deficient number is classified correctly"
    (is (= :deficient (classify 4)))))

(deftest classify_test_9
  (testing "Deficient numbers ▶ Medium deficient number is classified correctly"
    (is (= :deficient (classify 32)))))

(deftest classify_test_10
  (testing "Deficient numbers ▶ Large deficient number is classified correctly"
    (is (= :deficient (classify 33550337)))))

(deftest classify_test_11
  (testing "Deficient numbers ▶ Edge case (no factors other than itself) is classified correctly"
    (is (= :deficient (classify 1)))))
