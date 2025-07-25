;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Anagram: https://exercism.org/tracks/clojure/exercises/anagram/
(ns exercism.anagram-test
  (:require [clojure.test :refer :all])
  (:require [exercism.anagram :refer [anagrams-for]]))

(deftest anagrams-for_test_1
  (testing "no matches" (is (= [] (anagrams-for "diaper" ["hello" "world" "zombies" "pants"])))))

(deftest anagrams-for_test_2
  (testing "detects two anagrams"
    (is (= ["lemons" "melons"]
           (anagrams-for "solemn" ["lemons" "cherry" "melons"])))))

(deftest anagrams-for_test_3
  (testing "does not detect anagram subsets"
    (is (= []
           (anagrams-for "good" ["dog" "goody"])))))

(deftest anagrams-for_test_4
  (testing "detects anagram"
    (is (= ["inlets"]
           (anagrams-for "listen" ["enlists" "google" "inlets" "banana"])))))

(deftest anagrams-for_test_5
  (testing "detects three anagrams"
    (is (= ["gallery" "regally" "largely"]
           (anagrams-for "allergy" ["gallery" "ballerina" "regally" "clergy" "largely" "leading"])))))

(deftest anagrams-for_test_6
  (testing "detects multiple anagrams with different case"
    (is (= ["Eons" "ONES"]
           (anagrams-for "nose" ["Eons" "ONES"])))))

(deftest anagrams-for_test_7
  (testing "does not detect non-anagrams with identical checksum"
    (is (= []
           (anagrams-for "mass" ["last"])))))

(deftest anagrams-for_test_8
  (testing "detects anagrams case-insensitively"
    (is (= ["Carthorse"]
           (anagrams-for "Orchestra" ["cashregister" "Carthorse" "radishes"])))))

(deftest anagrams-for_test_9
  (testing "detects anagrams using case-insensitive subject"
    (is (= ["carthorse"]
           (anagrams-for "Orchestra" ["cashregister" "carthorse" "radishes"])))))

(deftest anagrams-for_test_10
  (testing "detects anagrams using case-insensitive possible matches"
    (is (= ["Carthorse"]
           (anagrams-for "orchestra" ["cashregister" "Carthorse" "radishes"])))))

(deftest anagrams-for_test_11
  (testing "does not detect an anagram if the original word is repeated"
    (is (= []
           (anagrams-for "go" ["goGoGO"])))))

(deftest anagrams-for_test_12
  (testing "anagrams must use all letters exactly once"
    (is (= []
           (anagrams-for "tapper" ["patter"])))))

(deftest anagrams-for_test_13
  (testing "words are not anagrams of themselves"
    (is (= []
           (anagrams-for "BANANA" ["BANANA"])))))

(deftest anagrams-for_test_14
  (testing "words are not anagrams of themselves even if letter case is partially different"
    (is (= []
           (anagrams-for "BANANA" ["Banana"])))))

(deftest anagrams-for_test_15
  (testing "words are not anagrams of themselves even if letter case is completely different"
    (is (= []
           (anagrams-for "BANANA" ["banana"])))))

(deftest anagrams-for_test_16
  (testing "words other than themselves can be anagrams"
    (is (= ["Silent"]
           (anagrams-for "LISTEN" ["LISTEN" "Silent"])))))

(deftest anagrams-for_test_17
  (testing "handles case of greek letters"
    (is (= ["ΒΓΑ" "γβα"]
           (anagrams-for "ΑΒΓ" ["ΒΓΑ" "ΒΓΔ" "γβα" "αβγ"])))))

(deftest anagrams-for_test_18
  (testing "different characters may have the same bytes"
    (is (= []
           (anagrams-for "a⬂" ["€a"])))))
