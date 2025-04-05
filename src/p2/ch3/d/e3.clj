;;; regular expression
;; to build a regex pattern use the function re-pattern or the equivalent reader macro #""
;;
;; re-matches: full match
;; re-find: find the first match
;; re-seq: find all matches

(ns p2.ch3.d.e3)

(defn -main []
    ;; re-matches matches a full string against the regex
    (println "Matches a.c against abc:" (re-matches (re-pattern "a.c") "abc"))
    (println "Matches a.c against abcabc:" (re-matches #"a.c" "abcabc"))
    (println)

    ;; re-find finds the first match
    (println "First match of a.c in abcaxc:" (re-find #"a.c" "abcaxc"))
    (println "First match of a.c in abdaxd:" (re-find #"a.c" "abdaxd"))
    (println)

    ;; re-find and anchors
    (println "Initial match of a.c in abcaxc:" (re-find #"^a.c" "abcaxc"))
    (println "Final match of a.c in abcaxc:" (re-find #"a.c$" "abcaxc"))
    (println)

    ;; re-seq finds all matches
    (println "All matches of a.c in abcaxc:" (re-seq #"a.c" "abcaxc"))
    (println "All matches of a.c in abdaxd:" (re-seq #"a.c" "abdaxd"))
    (println)
)
