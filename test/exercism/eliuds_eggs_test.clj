;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Eliud's Eggs: https://exercism.org/tracks/clojure/exercises/eliuds-eggs/
(ns exercism.eliuds-eggs-test
  (:require [clojure.test :refer :all])
  (:require [exercism.eliuds-eggs :refer [egg-count egg-count-bit]]))

(deftest egg-count_test_1
  (testing "0 eggs" (is (= 0 (egg-count 0))))
  (testing "0 eggs bit" (is (= 0 (egg-count-bit 0)))))

(deftest egg-count_test_2
  (testing "1 egg" (is (= 1 (egg-count 16))))
  (testing "1 egg bit" (is (= 1 (egg-count-bit 16)))))

(deftest egg-count_test_3
  (testing "4 eggs" (is (= 4 (egg-count 89))))
  (testing "4 eggs bit" (is (= 4 (egg-count-bit 89)))))

(deftest egg-count_test_4
  (testing "13 eggs" (is (= 13 (egg-count 2000000000))))
  (testing "13 eggs bit" (is (= 13 (egg-count-bit 2000000000)))))
