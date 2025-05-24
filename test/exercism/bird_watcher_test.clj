;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Bird Watcher: https://exercism.org/tracks/clojure/exercises/bird-watcher/

(ns exercism.bird-watcher-test
  (:require [clojure.test :refer :all])
  (:require [exercism.bird-watcher :refer [last-week today inc-bird day-without-birds?
                                           n-days-count busy-days odd-week?]]))

(deftest test-last-week (is (= [0 2 5 3 7 8 4] last-week)))

(deftest test-today
  (testing "Today's bird count of disappointing week" (is (= 0 (today [0 0 2 0 0 1 0]))))
  (testing "Today's bird count of busy week" (is (= 10 (today [8 8 9 5 4 7 10])))))

(deftest test-inc-bird
  (testing "Increment count w/o previous visits" (is (= [6 5 5 11 2 5 1] (inc-bird [6 5 5 11 2 5 0]))))
  (testing "Increment count w/ multiple previous visits" (is (= [5 2 4 2 4 5 8] (inc-bird [5 2 4 2 4 5 7])))))

(deftest test-day-without-birds?
  (testing "Has day w/o birds w/ day w/o birds" (is (= true (day-without-birds? [5 5 4 0 7 6 7]))))
  (testing "Has day w/o birds w/o day w/o birds" (is (= false (day-without-birds? [5 5 4 1 7 6 7])))))

(deftest test-n-days-count
  (testing "Count for first three days of disappointing week" (is (= 1 (n-days-count [0 0 1 0 0 1 0] 3))))
  (testing "Count for first 6 days of busy week" (is (= 48 (n-days-count [5 9 12 6 8 8 17] 6)))))

(deftest test-busy-days
  (testing "Busy days for disappointing week" (is (= 0 (busy-days [1 1 1 0 0 0 0]))))
  (testing "Busy days for busy week" (is (= 5 (busy-days [4 9 5 7 8 8 2])))))

(deftest test-odd-week?
  (testing "Odd week for week matching odd pattern" (is (= true (odd-week? [1 0 1 0 1 0 1]))))
  (testing "Odd week for week that does not match pattern" (is (= false (odd-week? [2 2 1 0 1 1 1])))))
