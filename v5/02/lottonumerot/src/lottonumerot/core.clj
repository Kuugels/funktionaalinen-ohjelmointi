(ns lottonumerot.core
  (:gen-class))

(defn numerot
  []
  (loop [numerot (set [])]
        ()
      (if (> (count numerot) 6)
          (println (str "numerot: " numerot))
          (recur (conj numerot (rand-int 39))))
  )
)

(defn -main
  "lakgnlangllöaieg juu"
  [& args]
  (numerot))
