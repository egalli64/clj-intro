(ns exercism.annalyns-infiltration-test
  (:require [clojure.test :refer :all])
  (:require [exercism.annalyns-infiltration :refer [can-fast-attack? can-spy? can-signal-prisoner? can-free-prisoner?]]))

(deftest test-can-fast-attack?
  (testing "Given can-fast-attack? test" (is (= false (can-fast-attack? true)))))

(deftest test-can-spy?
  (testing "Given can-spy? test" (is (= true (can-spy? false true false)))))

(deftest test-can-signal-prisoner?
  (testing "Given can-signal-prisoner? test" (is (= true (can-signal-prisoner? false true)))))

(deftest test-can-free-prisoner?
  (testing "Given can-free-prisoner? test" (is (= false (can-free-prisoner? false true false false))))
  (testing "test can-free-prisoner? /2" (is (= true (can-free-prisoner? true false false true))))
  )
