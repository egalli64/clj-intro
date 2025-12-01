(ns exercism.rotational-cipher-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercism.rotational-cipher :refer [rotate]]))

(deftest rotate-a-by-0-same-output
  (testing "Rotate 'a' by 0, same output as input"
    (is (= "a" (rotate "a" 0)))))

(deftest rotate-a-by-1
  (testing "Rotate 'a' by 1"
    (is (= "b" (rotate "a" 1)))))

(deftest rotate-a-by-26-same-output
  (testing "Rotate 'a' by 26, same output as input"
    (is (= "a" (rotate "a" 26)))))

(deftest rotate-m-by-13
  (testing "Rotate 'm' by 13"
    (is (= "z" (rotate "m" 13)))))

(deftest rotate-n-by-13-with-wrap
  (testing "Rotate 'n' by 13 with wrap around alphabet"
    (is (= "a" (rotate "n" 13)))))

(deftest rotate-capital-letters
  (testing "Rotate capital letters"
    (is (= "TRL" (rotate "OMG" 5)))))

(deftest rotate-spaces
  (testing "Rotate spaces"
    (is (= "T R L" (rotate "O M G" 5)))))

(deftest rotate-numbers
  (testing "Rotate numbers"
    (is (= "Xiwxmrk 1 2 3 xiwxmrk" (rotate "Testing 1 2 3 testing" 4)))))

(deftest rotate-punctuation
  (testing "Rotate punctuation"
    (is (= "Gzo'n zvo, Bmviyhv!" (rotate "Let's eat, Grandma!" 21)))))

(deftest rotate-all-letters
  (testing "Rotate all letters"
    (is (= "Gur dhvpx oebja sbk whzcf bire gur ynml qbt."
           (rotate "The quick brown fox jumps over the lazy dog." 13)))))
