;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Bank Account: https://exercism.org/tracks/clojure/exercises/bank-account/
(ns exercism.bank-account-test
  (:require [clojure.test :refer :all])
  (:require [exercism.bank-account :refer :all]))

(defn- pcalls "Executes the no-arg fns in parallel, returning a lazy sequence of their values"
  {:added "1.0" :static true} [& fns] (pmap #(%) fns))

#_(defn shutdown-agents-fixture [f] (f) (shutdown-agents))
;(use-fixtures :once shutdown-agents-fixture)

(deftest initial-account-state
  (testing "Accounts are opened with a balance of 0"
    (is (= 0 (-> (open-account) (get-balance))))))

(deftest increment-and-get-balance
  (testing "Adding money to the account works"
    (let [account (open-account)]
      (is (= 0 (get-balance account)))
      (update-balance account 10)
      (is (= 10 (get-balance account))))))

(deftest increment-decrement-and-get-balance
  (testing "Taking money out of the account works"
    (let [account (open-account)]
      (is (= 0 (get-balance account)))
      (update-balance account 10)
      (is (= 10 (get-balance account)))
      (update-balance account -10)
      (is (= 0 (get-balance account))))))

(deftest closed-accounts-are-nil
  (testing "Closing an account makes it nil"
    (let [account (open-account)]
      (close-account account)
      (is (nil? (get-balance account))))))

(deftest check-concurrent-access
  (testing "The account can handle parallel access"
    (let [account (open-account)
          add-10 #(update-balance account 10)]
      (doall (pcalls add-10 add-10 add-10 add-10 add-10))
      (is (= 50 (get-balance account))))))
