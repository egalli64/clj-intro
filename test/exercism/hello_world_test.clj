;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Hello World https://exercism.org/tracks/clojure/exercises/hello-world/
(ns exercism.hello-world-test
  (:require [clojure.test :refer :all])
  (:require [exercism.hello-world :refer [hello]]))

(deftest test-hello-world
  (is (= "Hello, World!" (hello))))
