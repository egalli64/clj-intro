;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; namespace

;; extracting the namespace from a well-formed symbol
(namespace 'whatever/xyz)
;; when the slash is missing nil is returned
(namespace 'a)

;; extracting the namespace from a well-formed keyword
(namespace :whatever/xyz)

;; for anything starting with double colon is always picked the current namespace
(namespace ::whatever)