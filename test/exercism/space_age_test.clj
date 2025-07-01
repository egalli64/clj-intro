;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Space Age: https://exercism.org/tracks/clojure/exercises/space-age/
(ns exercism.space-age-test
  (:require [clojure.test :refer :all])
  (:require [exercism.space-age :refer :all]))

(defn- rounds-to [expected actual]
  (is (= (Math/round ^double (* 100.0 expected))
         (Math/round ^double (* 100.0 actual)))))

(deftest on-earth_test_1
  (testing "age on Earth"
    (rounds-to 31.69 (on-earth 1000000000))))

(deftest on-mercury_test_1
  (testing "age on Mercury"
    (rounds-to 280.88 (on-mercury 2134835688))))

(deftest on-venus_test_1
  (testing "age on Venus"
    (rounds-to 9.78 (on-venus 189839836))))

(deftest on-mars_test_1
  (testing "age on Mars"
    (rounds-to 35.88 (on-mars 2129871239))))

(deftest on-jupiter_test_1
  (testing "age on Jupiter"
    (rounds-to 2.41 (on-jupiter 901876382))))

(deftest on-saturn_test_1
  (testing "age on Saturn"
    (rounds-to 2.15 (on-saturn 2000000000))))

(deftest on-uranus_test_1
  (testing "age on Uranus"
    (rounds-to 0.46 (on-uranus 1210123456))))

(deftest on-neptune_test_1
  (testing "age on Neptune"
    (rounds-to 0.35 (on-neptune 1821023456))))
