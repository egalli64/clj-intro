;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Proverb: https://exercism.org/tracks/clojure/exercises/proverb/
(ns exercism.proverb-test
  (:require [clojure.string :as str]
            [clojure.test :refer :all]
            [exercism.proverb :refer [recite]])
  )

(deftest zero-pieces
  (is (= "" (recite ()))))

(deftest one-piece
  (is (= (recite '("nail")) "And all for the want of a nail.")))

(deftest two-pieces
  (is (=
        (recite '("nail" "shoe"))
        (str/join "\n" ["For want of a nail the shoe was lost."
                        "And all for the want of a nail."]))))

(deftest three-pieces
  (is (=
        (recite '("nail" "shoe" "horse"))
        (str/join "\n" ["For want of a nail the shoe was lost."
                        "For want of a shoe the horse was lost."
                        "And all for the want of a nail."]))))

(deftest full-proverb
  (is (= (recite '("nail" "shoe" "horse" "rider" "message" "battle" "kingdom"))
         (str/join "\n" ["For want of a nail the shoe was lost."
                         "For want of a shoe the horse was lost."
                         "For want of a horse the rider was lost."
                         "For want of a rider the message was lost."
                         "For want of a message the battle was lost."
                         "For want of a battle the kingdom was lost."
                         "And all for the want of a nail."]))))

(deftest four-pieces-modernized
  (is (=
        (recite '("pin" "gun" "soldier" "battle"))
        (str/join "\n" ["For want of a pin the gun was lost."
                        "For want of a gun the soldier was lost."
                        "For want of a soldier the battle was lost."
                        "And all for the want of a pin."]))))
