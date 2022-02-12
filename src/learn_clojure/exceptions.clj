(ns learn-clojure.exceptions)

(defn exception-handling
  [x]
  (try (inc x)
       (catch ClassCastException e (println "Exception Caught! : " (.getMessage e)))
       (catch Exception e (println "Unexpected Exception Caught!"))
       (finally (println "Finally..."))
       )
  )
(exception-handling "Number")
