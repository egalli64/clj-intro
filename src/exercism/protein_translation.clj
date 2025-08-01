;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;;
;;;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;;;
;;;; Protein Translation: https://exercism.org/tracks/clojure/exercises/protein-translation/
(ns exercism.protein-translation)

(def stop-codons #{"UAA" "UAG" "UGA"})
(def codon-protein {"AUG" "Methionine",
                    "UUU" "Phenylalanine", "UUC" "Phenylalanine",
                    "UUA" "Leucine", "UUG" "Leucine",
                    "UCU" "Serine", "UCC" "Serine", "UCA" "Serine", "UCG" "Serine",
                    "UAU" "Tyrosine", "UAC" "Tyrosine",
                    "UGU" "Cysteine", "UGC" "Cysteine",
                    "UGG" "Tryptophan"})

(defn translate-rna "Translates an RNA string into amino acids." [rna]
  (let [codons (take-while #(not (stop-codons %)) (->> rna (partition-all 3) (map (partial apply str))))]
    (when (some #(when ((complement contains?) codon-protein %) %) codons)
      (throw (IllegalArgumentException. "Invalid codon")))
    (map codon-protein codons)))
