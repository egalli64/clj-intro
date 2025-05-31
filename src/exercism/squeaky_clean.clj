;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Squeaky Clean: https://exercism.org/tracks/clojure/exercises/squeaky-clean/
(ns exercism.squeaky-clean
  (:require [clojure.string :as str]))

(defn kebab-2-camel "replace each -c to C" [s]
  (if (= (str/index-of s \-) -1)
    s
    (let [chunks (str/split s #"-")]
      (apply str (cons (first chunks) (map #(str (str/upper-case (subs % 0 1)) (subs % 1)) (rest chunks)))))))

(defn clean "Remove 'dirty' characters from the passed string" [s]
  ;; chain multiple replaces, starting with s
  (-> s
      ;; Task 1: replace any spaces with underscores
      (.replace \space \_)
      ;; Task 2: replace any ctrl-char in \u0000-\u001F and \u007F-\u009F with "CTRL"
      (str/replace #"[\u0000-\u001F\u007F-\u009F]" "CTRL")
      ;; Task 3: convert kebab-case to camelCase
      (kebab-2-camel)
      ;; Task 4: keep only letters (and underscore)
      (#(apply str (filter (fn [ch] (or (^[char] Character/isLetter ch) (= ch \_))) %)))
      ;; Task 5: omit any Greek lowercase letter in range ['α' .. 'ω']
      (#(apply str (remove (fn [ch] (let [code (int ch)] (and (>= code 0x03B1) (<= code 0x03C9)))) %)))))
