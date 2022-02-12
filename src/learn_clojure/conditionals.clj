(ns learn-clojure.conditionals)


(defn ifCondition
  []
  (def a 10)
  (def b 10)
  (if (= a b)
  (println "Equal")
  (println "Not Equal")))
;(ifCondition)


(defn ifDoCondition
  []
  (def a 10)
  (def b 12)
  (if (= a b)
     (do (println "Equal")
        (println "..."))
     (do (println "Not Equal")
        (println "..."))
  )
)
;(ifDoCondition)

(defn nestedIf
  []
  (if (and (= 5 5) (= 3 3))
    (println "Equal")
    (println "Not Equal"))
)
;(nestedIf)

(defn cases
  [n]
  (case n
    1 (println "One")
    2 (println "Two")
    3 (println "Three"))
  )
;(cases  1)

(defn conds
  [n]
  (cond
    (> n 3) (println "Greater than Three")
    (> n 2) (println "Greater than Two")
    (> n 1) (println "Greater than One")
        :else (println "None!"))
  )
;(conds  8)