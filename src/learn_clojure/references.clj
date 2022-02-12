(ns learn-clojure.references)

(defn refs []
  (def amount (ref 100))
  (println @amount)

  (dosync
      (ref-set amount 101)
    )
  (println @amount)

  (dosync
    (alter amount inc)
    )
  (println @amount)
  )
(refs)
