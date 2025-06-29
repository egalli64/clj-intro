;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; RNA Transcription: https://exercism.org/tracks/clojure/exercises/rna-transcription/
(ns exercism.rna-transcription-test
  (:require [clojure.test :refer :all])
  (:require [exercism.rna-transcription :refer [to-rna]]))

(deftest to-rna_test_1
  (testing "Empty RNA sequence"
    (is (= "" (to-rna "")))))

(deftest to-rna_test_2
  (testing "RNA complement of cytosine is guanine"
    (is (= "G" (to-rna "C")))))

(deftest to-rna_test_3
  (testing "RNA complement of guanine is cytosine"
    (is (= "C" (to-rna "G")))))

(deftest to-rna_test_4
  (testing "RNA complement of thymine is adenine"
    (is (= "A" (to-rna "T")))))

(deftest to-rna_test_5
  (testing "RNA complement of adenine is uracil"
    (is (= "U" (to-rna "A")))))

(deftest to-rna_test_6
  (testing "RNA complement"
    (is (= "UGCACCAGAAUU" (to-rna "ACGTGGTCTTAA")))))
