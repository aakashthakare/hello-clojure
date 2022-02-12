(ns learn-clojure.operators
  (:gen-class))

; Operators
(defn ArithmeticOperators []
  (def a 12)
  (def b 2)

  (println (format "Operators used on a = %d and b = %d" a  b))
  (println "Add : " (+ a b))
  (println "Substract : " (- a b))
  (println "Multiply : " (* a b))
  (println "Increment : " (inc a))
  (println "Decrement : " (dec b))
  (println "Max : " (max a b))
  (println "Min : " (min a b))
  (println "Remainder : " (rem a b)))
;(ArithmeticOperators)

(defn RelationalOperators []
  (def a 11)
  (def b 22)

  (println (format "Operators used on a = %d and b = %d" a  b))
  (println "GT : " (> a b))
  (println "LT : " (< a b))
  (println "GTE : " (>= a b))
  (println "LTE : " (<= a b))
  (println "Not Equal : " (not= a b))
  (println "Equal : " (= a b)))
;(RelationalOperators)

(defn LogicalOperators []
  (def a true)
  (def b false)

  (println (format "Operators used on a = %s and b = %s" a  b))
  (println "AND : " (and a b))
  (println "OR : " (or a b))
  (println "NOT : " (not a)))
;(LogicalOperators)

(defn BitwiseOperators []
  (def a 101)
  (def b 100)

  (println (format "Operators used on a = %s and b = %s" a  b))
  (println "BIT-AND : " (and a b))
  (println "BIT-OR : " (or a b)))
;(BitwiseOperators)
