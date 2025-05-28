;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Interest is Interesting https://exercism.org/tracks/clojure/exercises/interest-is-interesting/
(ns exercism.interest-is-interesting-test
  (:require [clojure.test :refer :all])
  (:require [exercism.interest-is-interesting :refer [interest-rate annual-balance-update amount-to-donate]]))

(deftest test-interest-rate
  (testing "Given interest-rate example" (is (= 0.5 (interest-rate 200.75M))))
  (testing "Minimal interest-rate" (is (= 0.5 (interest-rate 0M))))
  (testing "Minimal interest-rate /2" (is (= 1.621 (interest-rate 1000.0M))))
  (testing "Minimal negative interest-rate" (is (= -3.213 (interest-rate -0.000001M))))
  (testing "Tiny interest-rate" (is (= 0.5 (interest-rate 0.000001M))))
  (testing "Tiny interest-rate /2" (is (= 1.621 (interest-rate 1000.0001M))))
  (testing "Tiny interest-rate /3" (is (= 2.475 (interest-rate 5000.0001M))))
  (testing "Maximum interest-rate" (is (= 0.5 (interest-rate 999.9999M))))
  (testing "Maximum interest-rate /2" (is (= 1.621 (interest-rate 4999.9990M)))))

(deftest test-annual-balance-update
  (testing "Given annual-balance-update example" (is (= 201.75375M (annual-balance-update 200.75M))))
  (testing "Small negative annual-balance-update" (is (= -0.12695199M (annual-balance-update -0.123M))))
  (testing "Large annual-balance-update" (is (= 1016.210101621M (annual-balance-update 1000.0001M))))
  (testing "Large negative annual-balance-update" (is (= -157878.97174203M (annual-balance-update -152964.231M)))))

(deftest test-amount-to-donate
  (testing "Given amount-to-donate example" (is (= 27 (amount-to-donate 550.5M 2.5))))
  (testing "Empty amount-to-donate example" (is (= 0 (amount-to-donate 0.0M 2.0))))
  (testing "Large negative amount-to-donate example" (is (= 0 (amount-to-donate -152964.231M 5.4)))))
