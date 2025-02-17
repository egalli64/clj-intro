;;; a file with functions required elsewhere

(ns p2.ch6.required)

(defn latlon->point "Convert lat/lon map to comma-separated string" [latlon]
    (str (:lon latlon) "," (:lat latlon))
)

(defn points [locations] (clojure.string/join " " (map latlon->point locations)))
