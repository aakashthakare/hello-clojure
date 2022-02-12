(ns learn-clojure.watchers)

(defn watch
  []
  (def a (atom 5))
  (add-watch a :aWatcher
             (fn [key atom old-state new-state]
               (println key)
               (println atom)
               (println old-state)
               (println new-state)
               ))
  (reset! a 10)
  (remove-watch a :aWatcher)
  (reset! a 5)
  )
;(watch)
