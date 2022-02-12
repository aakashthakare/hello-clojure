(ns learn-clojure.sequences)

(defn colorSequence
  []
  (def colors (seq ["RED","GREEN","BLUE"]))
  (def colorsVector ["RED","GREEN","BLUE"])
  (println colors)

  ;(println (cons "YELLOW" colors)) ;append new element in sequence
  ;(println (cons colors "YELLOW")) ;append sequence with sequence of String (each character) "YELLOW"

  ;NOTE : list grow at beginning, vector grow at end
  ;(println (conj colors "YELLOW"))
  ;(println (conj colorsVector "YELLOW"))

  (println (concat colors (seq ["BLACK", "WHITE"])))
  (println (distinct (seq [1 1 1 2 2 2 2])))

  (println (reverse colors))
  (println (first colors))
  (println (last colors))
  (println (rest colors)) ;except the first element

  (println (sort (seq [9 8 7 6 11]))))
(colorSequence)
