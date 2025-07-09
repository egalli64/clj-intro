;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Collatz Conjecture: https://exercism.org/tracks/clojure/exercises/collatz-conjecture/
(ns exercism.collatz-conjecture-test
  (:require [clojure.test :refer :all])
  (:require [exercism.collatz-conjecture :refer [collatz]]))

(deftest collatz_test_1
  (testing "zero steps for one" (is (= 0 (collatz 1)))))

(deftest collatz_test_2
  (testing "divide if even" (is (= 4 (collatz 16)))))

(deftest collatz_test_3
  (testing "even and odd steps" (is (= 9 (collatz 12)))))

(deftest collatz_test_4
  (testing "large number of even and odd steps" (is (= 152 (collatz 1000000)))))
