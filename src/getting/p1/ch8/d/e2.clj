;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; ^:dynamic binding *_*: a super-simple (debatable) logging functionality

;; to be used by "binding" a var should be dynamic
;; by convention dynamic vars are decorated with earmuffs *_*
;; the ^:dynamic syntax will be explained later
(def ^:dynamic *debug-enabled* false)
(defn debug [msg] (when *debug-enabled* (println msg)))

;; the debugging target
(defn some-troublesome-function-that-needs-logging []
  (debug "Hello logger"))

;; no logging
(some-troublesome-function-that-needs-logging)

;; in the binding scope debug is enabled
(binding [*debug-enabled* true]
  (debug "Calling that darned function")
  (some-troublesome-function-that-needs-logging)
  (debug "Back from that darned function"))

;; no logging
(some-troublesome-function-that-needs-logging)
