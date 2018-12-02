(ns kysyluku.core
  (:gen-class))

(defn parillinen
  []
  (loop [luku (read-line)]
    (if (number? (Integer/parseInt luku))
      (println (odd? (Integer/parseInt luku)))
      (recur (luku (read-line)))
    )
  )
)

(defn -main
  "Oispa kaljaa"
  [& args]
  (parillinen)
)
