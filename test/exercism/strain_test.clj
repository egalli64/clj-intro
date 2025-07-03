;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Strain: https://exercism.org/tracks/clojure/exercises/strain/
(ns exercism.strain-test
  (:require [clojure.test :refer :all])
  (:require [clojure.string :as str])
  (:require [exercism.strain :refer [retain discard]]))

(deftest retain_test_1
  (testing "keep on empty vector returns empty vector"
    (is (= [] (retain (fn [_] true) [])))))

(deftest retain_test_2
  (testing "keeps everything"
    (is (= [1 3 5]
           (retain (fn [_] true)
                   [1 3 5])))))

(deftest retain_test_3
  (testing "keeps nothing"
    (is (= []
           (retain (fn [_] false)
                   [1 3 5])))))

(deftest retain_test_4
  (testing "keeps first and last"
    (is (= [1 3]
           (retain odd?
                   [1 2 3])))))

(deftest retain_test_5
  (testing "keeps neither first nor last"
    (is (= [2]
           (retain even?
                   [1 2 3])))))

(deftest retain_test_6
  (testing "keeps strings"
    (is (= ["zebra" "zombies" "zealot"]
           (retain (fn [x] (str/starts-with? x "z"))
                   ["apple" "zebra" "banana" "zombies" "cherimoya" "zealot"])))))

(deftest retain_test_7
  (testing "keeps vectors"
    (is (= [[5 5 5] [5 1 2] [1 5 2] [1 2 5]]
           (retain (fn [x] (boolean (some #{5} x)))
                   [[1 2 3] [5 5 5] [5 1 2] [2 1 2] [1 5 2] [2 2 1] [1 2 5]])))))

(deftest discard_test_1
  (testing "discard on empty vector returns empty vector"
    (is (= []
           (discard (fn [_] true)
                    [])))))

(deftest discard_test_2
  (testing "discards everything"
    (is (= []
           (discard (fn [_] true)
                    [1 3 5])))))

(deftest discard_test_3
  (testing "discards nothing"
    (is (= [1 3 5]
           (discard (fn [_] false)
                    [1 3 5])))))

(deftest discard_test_4
  (testing "discards first and last"
    (is (= [2]
           (discard odd?
                    [1 2 3])))))

(deftest discard_test_5
  (testing "discards neither first nor last"
    (is (= [1 3]
           (discard even?
                    [1 2 3])))))

(deftest discard_test_6
  (testing "discards strings"
    (is (= ["apple" "banana" "cherimoya"]
           (discard (fn [x] (str/starts-with? x "z"))
                    ["apple" "zebra" "banana" "zombies" "cherimoya" "zealot"])))))

(deftest discard_test_7
  (testing "discards vectors"
    (is (= [[1 2 3] [2 1 2] [2 2 1]]
           (discard (fn [x] (boolean (some #{5} x)))
                    [[1 2 3] [5 5 5] [5 1 2] [2 1 2] [1 5 2] [2 2 1] [1 2 5]])))))
