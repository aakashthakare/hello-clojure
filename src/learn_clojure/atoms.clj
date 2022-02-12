(ns learn-clojure.atoms)

(defn declareAtom
  []
  (def atomNum (atom 10))
  (println @atomNum)

  (swap! atomNum inc)
  (println @atomNum)

  (reset! atomNum 1)
  (println @atomNum)

  (compare-and-set! atomNum 1 2)
  (println @atomNum)
  )
;(declareAtom)