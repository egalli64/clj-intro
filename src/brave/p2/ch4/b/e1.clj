;;; more on the map function

(ns brave.p2.ch4.b.e1)

(defn -main []
  ;; plain mapping
  (println "Map-increase a vector:" (map inc [1 2 3]))


  ;; mapping on more seqable
  ;; map concatenate by str two vector (like zip() in Python)
  (println "Map-str (zip) two vectors:" (map str ["a" "b" "c"] ["A" "B" "C"]))

  ;; a zip helper: takes two arguments and return them in a map
  (let [mapper (fn [l r] {:left l :right r})]
    ;; map join by custom function two vector 
    (println "Zip two vectors in map elements:" (map mapper ["a" "b" "c"] ["A" "B" "C"])))

  ;; the map function taking an anon function and a vector of functions
  (println "Map to increase, decrease, double a value:" (map #(% 21) [inc dec #(* % 2)]))

  ;; given a seqable of maps ...
  (let [numbers [{:it "uno" :en "one"} {:it "due" :en "two"} {:it "tre" :en "three"}]]
    ;; extract the values associated to the key :en
    (println "Map to get values from a seqable of maps" (map :en numbers))))