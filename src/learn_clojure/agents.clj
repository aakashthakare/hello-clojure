(ns learn-clojure.agents)

(defn agents []
  (def amount (agent 100))
  (println @amount)
  (send amount inc)
  (println @amount)
  (println "After some time.")
  (println @amount)
  (send amount inc)
  (await-for 1000 amount)
  (println @amount)

  (println (agent-error amount))
  )

(agents)