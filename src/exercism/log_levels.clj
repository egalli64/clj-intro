;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Log Levels: https://exercism.org/tracks/clojure/exercises/log-levels/
(ns exercism.log-levels)

(defn message
  "Takes a string representing a log line and returns its message with whitespace trimmed."
  [s] (.trim (second (.split s "]: "))))

(defn log-level
  "Takes a string representing a log line and returns its level in lower-case."
  [s] (.toLowerCase (.substring (first (.split s "]: ")) 1)))

(defn reformat
  "Takes a string representing a log line and formats it with the message first and the log level in parentheses."
  [s] (str (message s) " (" (log-level s) ")"))
