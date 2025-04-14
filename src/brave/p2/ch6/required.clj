;;; a file with functions required elsewhere

(ns brave.p2.ch6.required
  (:require [clojure.string :as str]))

(defn latlon->point "Convert lat/lon map to comma-separated string" [latlon]
  (str (:lon latlon) "," (:lat latlon)))

(defn points [locations] (str/join " " (map latlon->point locations)))