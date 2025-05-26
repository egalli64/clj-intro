;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Cars, Assemble: https://exercism.org/tracks/clojure/exercises/cars-assemble/

(ns exercism.cars-assemble-test
  (:require [clojure.test :refer :all])
  (:require [exercism.cars-assemble :refer [production-rate working-items]])
  )

(deftest test-production-rate
  (testing "Production rate for speed 6" (is (= 1193.4 (production-rate 6))))
  (testing "Production rate for speed 0" (is (= 0.0 (production-rate 0))))
  (testing "Production rate for speed 1" (is (= 221.0 (production-rate 1))))
  (testing "Production rate for speed 4" (is (= 884.0 (production-rate 4))))
  (testing "Production rate for speed 7" (is (= 1392.3 (production-rate 7))))
  (testing "Production rate for speed 9" (is (= 1591.2 (production-rate 9))))
  (testing "Production rate for speed 10" (is (= 1701.7 (production-rate 10)))))

(deftest test-working-items
  (testing "Working items for speed 6" (is (= 19 (working-items 6))))
  (testing "Working items for speed 0" (is (= 0 (working-items 0))))
  (testing "Working items for speed 1" (is (= 3 (working-items 1))))
  (testing "Working items for speed 5" (is (= 16 (working-items 5))))
  (testing "Working items for speed 8" (is (= 26 (working-items 8))))
  (testing "Working items for speed 9" (is (= 26 (working-items 9))))
  (testing "Working items for speed 10" (is (= 28 (working-items 10)))))
