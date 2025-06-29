;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; RNA Transcription: https://exercism.org/tracks/clojure/exercises/rna-transcription/
(ns exercism.rna-transcription)

;; DNA to RNA: G -> C, C -> G, T -> A, A -> U
(defn to-rna "Returns the RNA complement of the given DNA string sequence."
  [dna]
  ;; define the mapping between DNA nucleotide to the RNA nucleotide
  (let [char-map {\G \C, \C \G, \T \A, \A \U}]
    ;; use the thread-last macro to start a pipeline on the input DNA sequence
    (->> dna
         ;; each element (char) in the seq (derived from the dna string) is mapped by the char-map
         ;; assuming no spurious nucleotide is present in the input DNA
         (map #(get char-map %))
         ;; convert back the seq to a proper string
         (apply str))))
