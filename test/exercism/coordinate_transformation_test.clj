;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Coordinate Transformation: https://exercism.org/tracks/clojure/exercises/coordinate-transformation/
(ns exercism.coordinate-transformation-test
  (:require [clojure.test :refer :all])
  (:require [exercism.coordinate-transformation :refer [translate2d scale2d compose-transform memoize-transform]]))

(deftest test-translate2d
  (testing "Given translate2d test"
    (let [fun (translate2d 2 0)] (is (= (fun 4 8) [6 8])))))

(deftest test-scale2d
  (testing "Given scale2d test"
    (let [fun (scale2d 2 2)] (is (= (fun 6 -3) [12 -6])))))

(deftest test-compose-transform
  (testing "Given compose-transform test"
    (let [f1 (translate2d 2 0), f2 (scale2d 2 2), f3 (compose-transform f1 f2)]
      (is (= (f3 0 1) [4 2])))))

(deftest test-memoize-transform
  (testing "Given memoize-transform test"
    (let [f1 (scale2d 3 3), f2 (memoize-transform f1)]
      (is (= (f2 4 3) (f2 4 3) [12 9])))))
