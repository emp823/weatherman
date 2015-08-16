(ns weatherMan.core
  (:gen-class))

(defn -main
  "Testing out functions"
  [& args]
  (defn addTwo
    "It adds two to someting"
    [number]
    (+ 2 number))
  (if (= 1 1)
    (do (println (map addTwo [1 2 3]))
        "its good")
    (do (println "Not")
        "wide right"))
  (defn testDestructure
    "It takes the first two args and a list of remaining"
    [[one two & three]]
    (println (str "One is " one))
    (println (str "Two is " two))
    (println (str "Three is " three)))
  (testDestructure [1 2 3 4 5 6]))
