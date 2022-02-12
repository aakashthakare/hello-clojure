(ns learn-clojure.destructure)

(defn destruct
  []
  (def vect [1 2 3 4])
  (let [[a b c] vect] (println a b c))
  (let [[a & rest] vect] (println a rest))

  (def nameMap {'name "James" 'surname "Jones"} )
  (let [{a 'name b 'surname} nameMap ] (println a b))
  (let [{a 'name b 'surname c 'unknown} nameMap ] (println a b c))
  )
(destruct)
