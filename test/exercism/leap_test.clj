;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Leap: https://exercism.org/tracks/clojure/exercises/leap/
(ns exercism.leap-test
  (:require [clojure.test :refer :all])
  (:require [exercism.leap :refer [leap-year?]]))

(deftest test-leap-year?
  (testing "Positive hundred test" (is (leap-year? 2000)))
  (testing "Negative hundred test" (is (not (leap-year? 1900))))
  (testing "Positive plain test" (is (leap-year? 2004)))
  (testing "Negative test" (is (not (leap-year? 1997)))))
