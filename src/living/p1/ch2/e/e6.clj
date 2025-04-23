;;; For more info read Living Clojure by Carin Meier
;; Data transformation: the for expression, :let and :when modifiers

(def animals [:mouse :duck :lory :penguin])
(def colors ["blue", "red"])

(println "The original seqs:" animals colors)
(println "Keyword to name conversion:" (name (first animals)))

(print "Convert all the keywords in the seq: ")
(println (for [animal animals] (str (name animal))))

(println "The cartesian product of the two seqs:")
(println (for [animal animals color colors] [(name animal) color]))

;; using the :let modifier to create two local binding to be used in the expression
(println "Cartesian product w/ char count:")
(println (for [animal animals color colors
               :let [x (name animal) size (+ (count color) (count x))]] [x color size]))

;; using the :when modifier to filter the elements to be generated
(println "Cartesian product filtered for odd char count:")
(println (for [animal animals color colors
               :let [x (name animal) size (+ (count color) (count x))]
               :when (odd? size)] [x color]))
