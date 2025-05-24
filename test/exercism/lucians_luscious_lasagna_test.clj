;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Lucian's Luscious Lasagna: https://exercism.org/tracks/clojure/exercises/lucians-luscious-lasagna/

(ns exercism.lucians-luscious-lasagna_test
  (:require [clojure.test :refer :all])
  (:require [exercism.lucians-luscious-lasagna :refer [expected-time
                                                       remaining-time
                                                       prep-time
                                                       total-time
                                                       ]]))

(deftest test-expected-time (is (= 40 expected-time)))

(deftest test-remaining-time (is (= 15 (remaining-time 25))))

(deftest test-prep-time-single (is (= 2 (prep-time 1))))
(deftest test-prep-time-multi (is (= 8 (prep-time 4))))

(deftest test-total-time-single (is (= 32 (total-time 1 30))))
(deftest test-total-time-multi (is (= 16 (total-time 4 8))))
