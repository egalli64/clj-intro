;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Hamming: https://exercism.org/tracks/clojure/exercises/hamming/
(ns exercism.hamming-test
  (:require [clojure.test :refer :all])
  (:require [exercism.hamming :refer [distance]]))

(deftest distance_test_1
  (testing "empty strands"
    (is (= 0 (distance "" "")))))

(deftest distance_test_2
  (testing "single letter identical strands"
    (is (= 0 (distance "A" "A")))))

(deftest distance_test_3
  (testing "single letter different strands"
    (is (= 1 (distance "G" "T")))))

(deftest distance_test_4
  (testing "long identical strands"
    (is (= 0 (distance "GGACTGAAATCTG" "GGACTGAAATCTG")))))

(deftest distance_test_5
  (testing "long different strands"
    (is (= 9 (distance "GGACGGATTCTG" "AGGACGGATTCT")))))

(deftest distance_test_6
  (testing "disallow first strand longer"
    (is (thrown-with-msg? IllegalArgumentException #"^strands must be of equal length$"
                          (distance "AATG" "AAA")))))

(deftest distance_test_7
  (testing "disallow second strand longer"
    (is (thrown-with-msg? IllegalArgumentException #"^strands must be of equal length$"
                          (distance "ATA" "AGTG")))))

(deftest distance_test_8
  (testing "disallow empty first strand"
    (is (thrown-with-msg? IllegalArgumentException #"^strands must be of equal length$"
                          (distance "" "G")))))

(deftest distance_test_9
  (testing "disallow empty second strand"
    (is (thrown-with-msg? IllegalArgumentException #"^strands must be of equal length$"
                          (distance "G" "")))))
