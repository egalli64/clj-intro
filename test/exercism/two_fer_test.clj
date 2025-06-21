;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Two Fer: https://exercism.org/tracks/clojure/exercises/two-fer/
(ns exercism.two-fer-test
  (:require [clojure.test :refer :all])
  (:require [exercism.two-fer :refer [two-fer]]))

(deftest test-two-fer
  (testing "Alice test" (is (= "One for Alice, one for me." (two-fer "Alice")))))

(deftest test-two-fer-missing
  (testing "Empty test" (is (= "One for you, one for me." (two-fer))))
  (testing "Empty test" (is (= "One for you, one for me." (two-fer "")))))
