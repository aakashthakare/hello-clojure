(ns learn-clojure.loops)


(defn forLoop
  []
  (println "Loop Example : ")
  (loop [i 0]
    (when (< i 10)
      (println i)
      (recur (inc i))
      )
    )
)
;(forLoop)


(defn doLoop
  []
  (println "Do Loop Example : ")
  (dotimes [i 5]
      (println i)
    )
  )
;(doLoop)

(defn whileLoop
  [count]
  (println "While Loop Example : ")
  (def i (atom 0))
  (while (< @i count)
    (do
      (println @i)
      (swap! i inc))
    )
  )
;(whileLoop 10)

(defn seqLoop
  [seq]
  (println "Sequence Loop Example : ")
  (doseq [i seq]
    (println (inc i))
    )
  )
;(seqLoop [1 2 3])
