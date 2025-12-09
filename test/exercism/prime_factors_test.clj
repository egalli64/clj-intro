(ns exercism.prime-factors-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercism.prime-factors :refer [of]]))

(deftest of_test_1
  (testing "no factors"
    (is (= [] (of 1)))))

(deftest of_test_2
  (testing "prime number"
    (is (= [2] (of 2)))))

(deftest of_test_3
  (testing "another prime number"
    (is (= [3] (of 3)))))

(deftest of_test_4
  (testing "square of a prime"
    (is (= [3 3] (of 9)))))

(deftest of_test_5
  (testing "product of first prime"
    (is (= [2 2] (of 4)))))

(deftest of_test_6
  (testing "cube of a prime"
    (is (= [2 2 2] (of 8)))))

(deftest of_test_7
  (testing "product of second prime"
    (is (= [3 3 3] (of 27)))))

(deftest of_test_8
  (testing "product of third prime"
    (is (= [5 5 5 5] (of 625)))))

(deftest of_test_9
  (testing "product of first and second prime"
    (is (= [2 3] (of 6)))))

(deftest of_test_10
  (testing "product of primes and non-primes"
    (is (= [2 2 3] (of 12)))))

(deftest of_test_11
  (testing "product of primes"
    (is (= [5 17 23 461] (of 901255)))))

(deftest of_test_12
  (testing "factors include a large prime"
    (is (= [11 9539 894119] (of 93819012551)))))
