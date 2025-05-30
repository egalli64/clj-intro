;;; require, refer, alias, use
;;
;; (require 'some.namespace) or (require ['some.namespace :as alias])
;; loads a namespace, making its vars available with explicit namespace qualification
;;
;; (require '[some.namespace :refer [function1 function2]])
;; refer is used to import functions from a namespace, to be used without a namespace qualifier

(ns brave.p2.ch6.e4
  ;; require preferred way, as namespace directive
  (:require [brave.p2.ch6.required :as rq]))

;; external dependency by standalone require
;; (require '[brave.p2.ch6.required :refer [points]])

;; "use" to bring all bindings from a namespace in the current one (don't do it)
;; (use '[brave.p2.ch6.required])

;; external dependency with alias by standalone require
;; (require '[brave.p2.ch6.required :as rq])

(def locations [{:lat 50.95 :lon 6.97} {:lat 47.37 :lon 8.55} {:lat 43.30 :lon 5.37} {:lat 47.37 :lon 8.55}])

(defn -main []
  ;; when points is accessed by refer
  ;; (println (points locations))

  ;; when using an alias for the other namespace
  (println (rq/points locations)))