;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;;
;;;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;;;
;;;; Protein Translation: https://exercism.org/tracks/clojure/exercises/protein-translation/
(ns exercism.protein-translation-test
  (:require [clojure.test :refer :all]
            [exercism.protein-translation :refer [translate-rna]]))

(deftest translate-rna_test_1
  (testing "Empty RNA sequence results in no proteins"
    (is (= [] (translate-rna "")))))

(deftest translate-rna_test_2
  (testing "Methionine RNA sequence"
    (is (= ["Methionine"]
           (translate-rna "AUG")))))

(deftest translate-rna_test_3
  (testing "Phenylalanine RNA sequence 1"
    (is (= ["Phenylalanine"]
           (translate-rna "UUU")))))

(deftest translate-rna_test_4
  (testing "Phenylalanine RNA sequence 2"
    (is (= ["Phenylalanine"]
           (translate-rna "UUC")))))

(deftest translate-rna_test_5
  (testing "Leucine RNA sequence 1"
    (is (= ["Leucine"]
           (translate-rna "UUA")))))

(deftest translate-rna_test_6
  (testing "Leucine RNA sequence 2"
    (is (= ["Leucine"]
           (translate-rna "UUG")))))

(deftest translate-rna_test_7
  (testing "Serine RNA sequence 1"
    (is (= ["Serine"]
           (translate-rna "UCU")))))

(deftest translate-rna_test_8
  (testing "Serine RNA sequence 2"
    (is (= ["Serine"]
           (translate-rna "UCC")))))

(deftest translate-rna_test_9
  (testing "Serine RNA sequence 3"
    (is (= ["Serine"]
           (translate-rna "UCA")))))

(deftest translate-rna_test_10
  (testing "Serine RNA sequence 4"
    (is (= ["Serine"]
           (translate-rna "UCG")))))

(deftest translate-rna_test_11
  (testing "Tyrosine RNA sequence 1"
    (is (= ["Tyrosine"]
           (translate-rna "UAU")))))

(deftest translate-rna_test_12
  (testing "Tyrosine RNA sequence 2"
    (is (= ["Tyrosine"]
           (translate-rna "UAC")))))

(deftest translate-rna_test_13
  (testing "Cysteine RNA sequence 1"
    (is (= ["Cysteine"]
           (translate-rna "UGU")))))

(deftest translate-rna_test_14
  (testing "Cysteine RNA sequence 2"
    (is (= ["Cysteine"]
           (translate-rna "UGC")))))

(deftest translate-rna_test_15
  (testing "Tryptophan RNA sequence"
    (is (= ["Tryptophan"]
           (translate-rna "UGG")))))

(deftest translate-rna_test_16
  (testing "STOP codon RNA sequence 1"
    (is (= []
           (translate-rna "UAA")))))

(deftest translate-rna_test_17
  (testing "STOP codon RNA sequence 2"
    (is (= []
           (translate-rna "UAG")))))

(deftest translate-rna_test_18
  (testing "STOP codon RNA sequence 3"
    (is (= []
           (translate-rna "UGA")))))

(deftest translate-rna_test_19
  (testing "Sequence of two protein codons translates into proteins"
    (is (= ["Phenylalanine" "Phenylalanine"]
           (translate-rna "UUUUUU")))))

(deftest translate-rna_test_20
  (testing "Sequence of two different protein codons translates into proteins"
    (is (= ["Leucine" "Leucine"]
           (translate-rna "UUAUUG")))))

(deftest translate-rna_test_21
  (testing "Translate RNA strand into correct protein list"
    (is (= ["Methionine" "Phenylalanine" "Tryptophan"]
           (translate-rna "AUGUUUUGG")))))

(deftest translate-rna_test_22
  (testing "Translation stops if STOP codon at beginning of sequence"
    (is (= []
           (translate-rna "UAGUGG")))))

(deftest translate-rna_test_23
  (testing "Translation stops if STOP codon at end of two-codon sequence"
    (is (= ["Tryptophan"]
           (translate-rna "UGGUAG")))))

(deftest translate-rna_test_24
  (testing "Translation stops if STOP codon at end of three-codon sequence"
    (is (= ["Methionine" "Phenylalanine"]
           (translate-rna "AUGUUUUAA")))))

(deftest translate-rna_test_25
  (testing "Translation stops if STOP codon in middle of three-codon sequence"
    (is (= ["Tryptophan"]
           (translate-rna "UGGUAGUGG")))))

(deftest translate-rna_test_26
  (testing "Translation stops if STOP codon in middle of six-codon sequence"
    (is (= ["Tryptophan" "Cysteine" "Tyrosine"]
           (translate-rna "UGGUGUUAUUAAUGGUUU")))))

(deftest translate-rna_test_27
  (testing "Sequence of two non-STOP codons does not translate to a STOP codon"
    (is (= ["Methionine" "Methionine"]
           (translate-rna "AUGAUG")))))

(deftest translate-rna_test_28
  (testing "Unknown amino acids, not part of a codon, can't translate"
    (is (thrown-with-msg? IllegalArgumentException #"^Invalid codon$"
                          (translate-rna "XYZ")))))

(deftest translate-rna_test_29
  (testing "Incomplete RNA sequence can't translate"
    (is (thrown-with-msg? IllegalArgumentException #"^Invalid codon$"
                          (translate-rna "AUGU")))))

(deftest translate-rna_test_30
  (testing "Incomplete RNA sequence can translate if valid until a STOP codon"
    (is (= ["Phenylalanine" "Phenylalanine"]
           (translate-rna "UUCUUCUAAUGGU")))))
