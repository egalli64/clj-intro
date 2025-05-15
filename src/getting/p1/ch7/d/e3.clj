;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let binding duplication - probably a mistake

;; it works fine, but it is obscure and pretty useless
(let [
      ;; initial binding of title
      title "Pride and Prejudice"
      ;; title is rebound to a new value (based on the previous binding)
      title (str title " and Zombies")]
  ;; no way to access to the first value, that is lost
  (println title))

;; having two different bound values is probably a more sound solution
(let [
      title-classic "Pride and Prejudice"
      title-modern (str title-classic " and Zombies")]
  (println "The classic title:" title-classic)
  (println "A modern title:" title-modern))
