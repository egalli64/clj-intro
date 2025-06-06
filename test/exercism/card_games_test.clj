;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Card Games : https://exercism.org/tracks/clojure/exercises/card-games/

(ns exercism.card-games-test
  (:require [clojure.test :refer :all])
  (:require [exercism.card-games :refer :all]))

(deftest test-rounds
  (testing "Given for rounds" (is (= '(27 28 29) (rounds 27)))))

(deftest test-concat-rounds
  (testing "Given for concat-rounds" (is (= '(27 28 29 35 36) (concat-rounds '(27 28 29) '(35 36))))))

(deftest test-contains-round?
  (testing "Given for contains-round? /1" (is (= true (contains-round? '(27 28 29 35 36) 29))))
  (testing "Given for contains-round? /2" (is (= false (contains-round? '(27 28 29 35 36) 30)))))

(deftest test-card-average
  (testing "Given for card-average" (is (= 6.0 (card-average '(5 6 7))))))

(deftest test-approx-average?
  (testing "Given for approx-average? /1" (is (= true (approx-average? '(1 2 3)))))
  (testing "Given for approx-average? /2" (is (= true (approx-average? '(2 3 4 8 8)))))
  (testing "Given for approx-average? /3" (is (= false (approx-average? '(1 2 3 5 9))))))

(deftest test-average-even-odd?
  (testing "Given for average-even-odd? /1" (is (= true (average-even-odd? '(1 2 3)))))
  (testing "Given for average-even-odd? /2" (is (= false (average-even-odd? '(1 2 3 4))))))

(deftest test-maybe-double-last
  (testing "Given for maybe-double-last /1" (is (= '(5 9 22) (maybe-double-last '(5 9 11)))))
  (testing "Given for maybe-double-last /2" (is (= '(5 9 10) (maybe-double-last '(5 9 10))))))
