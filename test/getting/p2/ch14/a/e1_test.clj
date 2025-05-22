;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; clojure.test, deftest, is, testing

(ns getting.p2.ch14.a.e1-test
  (:require [clojure.test :refer :all])
  (:require [getting.p2.ch14.a.e1 :refer [find-by-title number-of-copies-of]]))

;; mock collection of book for testing
(def books
  [{:title "2001" :author "Clarke" :copies 21}
   {:title "Emma" :author "Austen" :copies 10}
   {:title "Misery" :author "King" :copies 101}])

;; call the tested method
;; use "is" to generate an assertion
(deftest test-finding-books
  ;; more assertions could be put in a test (but it obscures the result in case of failure!)
  (is (not (nil? (find-by-title "Emma" books))))
  (is (nil? (find-by-title "XYZZY" books))))

(deftest test-basic-inventory
  ;; use testing to keep similar tests together
  (testing "Finding books - positive"
    (is (not (nil? (find-by-title "Emma" books)))))
  (testing "Finding books - negative"
    (is (nil? (find-by-title "XYZZY" books))))
  ;; I would put this subtest in a separate test, but it's a free choice
  (testing "Copies in inventory"
    (is (= 10 (number-of-copies-of "Emma" books)))))
