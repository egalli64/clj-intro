;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Squeaky Clean: https://exercism.org/tracks/clojure/exercises/squeaky-clean/
(ns exercism.squeaky-clean-test
  (:require [clojure.test :refer :all])
  (:require [exercism.squeaky-clean :refer [clean kebab-2-camel]]))

(deftest test-task-1
  (testing "Given clean spaces test" (is (= "my___Id" (clean "my   Id")))))

(deftest test-task-2
  (testing "Given clean ctrl-char test" (is (= "myCTRLId" (clean "my\u007FId")))))

(deftest test-task-3
  (testing "Given kebab to snake test" (is (= "àḂç" (kebab-2-camel "à-ḃç"))))
  (testing "Kebab to snake /1" (is (= "hello" (kebab-2-camel "hello"))))
  (testing "Given clean kebab to snake test" (is (= "àḂç" (clean "à-ḃç"))))
  )

(deftest test-task-4
  (testing "Given clean not-letters test" (is (= "" (clean "1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00")))))

(deftest test-task-5
  (testing "Given clean greek test" (is (= "MyΟFinder" (clean "MyΟβιεγτFinder")))))
