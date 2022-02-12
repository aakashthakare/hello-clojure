(ns learn-clojure.functions
  (:gen-class))

(defn -main
  "First function!"
  []
  (println "This is my first function!")
  (println "Clojure need repl and lein!")
  (+ 1 2))

; Increment function
(def increment (fn [x] (+ x 1)))

(defn increment_each
  [x]
  (map increment x))
;(increment_each [1 2 3])

; Function without name
;(fn (println "Unnamed function!"))
;(fn (println "Unnamed function!" %))
;(fn (println "Unnamed function!" %1 %2))
#(println "Unnamed function with #!")