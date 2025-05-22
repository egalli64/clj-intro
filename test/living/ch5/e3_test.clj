;;; For more info read Living Clojure by Carin Meier
;; Lazy import of all functionality provided by clojure.test

(ns living.ch5.e3_test
  (:require [clojure.test :refer :all]
            [living.ch5.e3 :refer [serpent-talk]]))

(deftest test-serpent-talk
  (testing "Cries serpent! with a snake_case version of the input"
    (is (= "Serpent! You said: hello_there"
           (serpent-talk "hello there")))))
