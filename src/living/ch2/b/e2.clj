;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Composition with comp as function factory

;; a simple function
(defn toggle-grow [direction] (if (= direction :small) :big :small))

(let [direction :small]
  (println "Direction is" direction "- toggled direction is" (toggle-grow direction)))

(let [direction :big]
  (println "Direction is" direction "- toggled direction is" (toggle-grow direction)))

;; another simple function
(defn oh-my [direction] (str "Oh My! You are growing " direction))

(let [direction :small]
  (print (oh-my direction) "- ")
  ;; composing "by hand" the two functions
  (println (oh-my (toggle-grow direction))))

;; composing the two functions by comp
;; the argument is passed to the most right one
;; its result is passed to the funtion to its left
(defn surprise [direction] ((comp oh-my toggle-grow) direction))

(let [direction :big]
  (print (oh-my direction) "- ")
  ;; calling the comp function
  (println (surprise direction)))
