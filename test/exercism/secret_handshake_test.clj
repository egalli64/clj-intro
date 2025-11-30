;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Secret Handshake: https://exercism.org/tracks/clojure/exercises/secret-handshake/
(ns exercism.secret-handshake-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercism.secret-handshake :refer [commands]]))

(deftest wink
  (testing "a wink is returned for binary 1" (is (= ["wink"] (commands 1)))))

(deftest double-blink
  (testing "a double blink is returned for a binary 10" (is (= ["double blink"] (commands 2)))))

(deftest close-your-eyes
  (testing "a close your eyes is returned for a binary 100" (is (= ["close your eyes"] (commands 4)))))

(deftest jump
  (testing "a jump is returned for a binary 1000" (is (= ["jump"] (commands 8)))))

(deftest two-actions
  (testing "commands returns multiple actions" (is (= ["wink" "double blink"] (commands 3)))))

(deftest reversing
  (testing "giving a binary 10000 reverses actions" (is (= ["double blink" "wink"] (commands 19)))))

(deftest reversing-one-action
  (testing "reversing one action returns the same action" (is (= ["jump"] (commands 24)))))

(deftest reverse-nothing
  (testing "reversing nothing still gives nothing" (is (= [] (commands 16)))))

(deftest all-actions
  (testing "all actions together"
    (is (= ["wink" "double blink" "close your eyes" "jump"] (commands 15)))))

(deftest reverse-all-actions
  (testing "reversing all actions together" (is (= ["jump" "close your eyes" "double blink" "wink"] (commands 31)))))

(deftest nothing
  (testing "do nothing for 0" (is (= [] (commands 0)))))

(deftest lower-5-bits-zero
  (testing "do nothing for high numbers if lower 5 bits not set" (is (= [] (commands 32)))))
