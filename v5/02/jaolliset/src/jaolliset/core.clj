(ns jaolliset.core
  (:gen-class))

(defn jaolliset
  [raja]
  (loop [kierros 1]
    (if (= (mod kierros 3) 0)
      (println (str kierros " on jaollinen kolmella"))
      (println (str kierros " ei ole jaollinen kolmella")))
    (if (> kierros raja)
      (println "Moi pitää mennä")
      (recur (inc kierros))))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (jaolliset 4))
