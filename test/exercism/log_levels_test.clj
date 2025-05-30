;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Log Levels: https://exercism.org/tracks/clojure/exercises/log-levels/

(ns exercism.log-levels-test
  (:require [clojure.test :refer :all])
  (:require [exercism.log-levels :refer [message log-level reformat]]))

(deftest test-message
  (testing "Given message test /1" (is (= "Invalid operation" (message "[ERROR]: Invalid operation"))))
  (testing "Given message test /2" (is (= "Disk almost full" (message "[WARNING]:  Disk almost full\r\n")))))

(deftest test-log-level
  (testing "Given log-level test" (is (= "error" (log-level "[ERROR]: Invalid operation")))))

(deftest test-reformat
  (testing "Given reformat test" (is (= "Operation completed (info)" (reformat "[INFO]: Operation completed")))))
