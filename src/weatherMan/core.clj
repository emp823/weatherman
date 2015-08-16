(ns weatherMan.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (if (= 1 1)
    (do (println (conj [1 2 3] 4))
        "its good")
    (do (println "Not")
        "wide right")))
