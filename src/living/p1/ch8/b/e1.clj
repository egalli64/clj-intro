;;; For more info read Living Clojure by Carin Meier
;; no macro

(ns living.p1.ch8.b.e1)

(defn hi-queen [phrase] (str phrase ", so please your Majesty."))
(defn alice-hi-queen [] (hi-queen "My name is Alice"))
(defn march-hare-hi-queen [] (hi-queen "I'm the March Hare"))
(defn white-rabbit-hi-queen [] (hi-queen "I'm the White Rabbit"))
(defn mad-hatter-hi-queen [] (hi-queen "I'm the Mad Hatter"))


(defn -main []
  (println (alice-hi-queen))
  (println (march-hare-hi-queen))
  (println (white-rabbit-hi-queen))
  (println (mad-hatter-hi-queen)))
