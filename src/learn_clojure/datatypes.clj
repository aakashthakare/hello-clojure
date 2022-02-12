(ns learn-clojure.datatypes
  (:gen-class))


; Data Types
(defn DataTypes []
  (def a 1)
  (def b 1.1)
  (def c 1.1e-1)
  (def d 0xfbfc)
  (def e true)
  (def f nil)
  (def g "String")
  (def h 'reference) ;Kind of Pointer

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h))
;(DataTypes) ; Call to the function

; Variables
(defn Variables []
  (def isBoolean false)
  (def isBOOLEAN true)

  (println isBoolean)  ;Clojure is Case Sensitive!
  (println isBOOLEAN))
;(Variables)

; Sets
(defn Sets []
  (def a #{1 2 3})
  (def b #{1 1.1 true "Hello!" 'abc})

  (println a)
  (println b))
;(Sets)

; Map
(defn Maps []
  (def a (hash-map 1 1, 2 2, 3 3))
  (def b (sorted-map 1 1, 2 2, 3 3))
  (def c #{1 "A", 2 1.1, 3 true, 4 "Hello!", 5 'abc})

  (println a)
  (println b)
  (println c))
;(Maps)

; Vector
(defn Vectors []
  (def a [1 2 3])

  (println a))
;(Vectors)

; List
(defn Lists []
  (def a (list 1 2 3))
  (defn myFunction [] (println "Function in List."))
  (println a)
  (myFunction))
;(Lists)