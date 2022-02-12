(ns learn-clojure.struct-maps)

(defn student
  []
  (defstruct studentStruct :name :surname)
  (def defaultStudent (struct studentStruct "John" "Doe"))
  (println defaultStudent)

  (def studentStructMap (struct-map studentStruct :name "James" :surname "Cameron"))
  (println studentStructMap)

  (println (defaultStudent :name))
  (println (defaultStudent :surname))

  (def newStudent (assoc defaultStudent :rollNumber 1))
  (println newStudent)

  )
;(student)
