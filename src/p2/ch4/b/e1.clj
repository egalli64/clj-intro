;;; map

(ns p2.ch4.b.e1)

(defn -main []
    ;; plain mapping
    (println "Map increase a vector:" (map inc [1 2 3]))

    ;; mapping on more seqable
    ;; map concatenate by str two vector (like zip() in Python)
    (println "Map zip two vectors /1:" (map str ["a" "b" "c"] ["A" "B" "C"]))
    ;; a zip helper: takes two arguments and return them in a map
    (defn mapper [left right] {:left left :right right})
    ;; map join by custom function two vector 
    (println "Map zip two vectors /2:" (map mapper ["a" "b" "c"] ["A" "B" "C"]))

    ;; map to apply a vector of functions
    (println "Map to increase, decrease, double a value:" (map #(% 21) [inc dec #(* % 2)]))

    ;; given a seqable of maps ...
    (let [numbers [{:it "uno" :en "one"} {:it "due" :en "two"} {:it "tre" :en "three"}]]
        ;; extract the values associated to the key :en
        (println "Map to get values from a seqable of maps" (map :en numbers))
    )
)
