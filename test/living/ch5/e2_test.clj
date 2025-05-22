;;; For more info read Living Clojure by Carin Meier
;; Sample function for show how to test - import dependencies by :require, deftest, testing, is

(ns living.ch5.e2-test
  (:require [clojure.test :refer [deftest testing is]]
            [living.ch5.e2 :refer [double-it]]))

(deftest test-double-input
  (testing "doubling a positive number" (is (= (double-it 5) 10))))
