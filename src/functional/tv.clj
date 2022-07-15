(ns functional.tv
  (:require [clojure.string :as str])
  (:gen-class))

;; 20220715
(defn regroup [string size]
  (let [replaced (str/replace string #"-" "")
        length (count replaced) ]
    ;;(println "here: " (< size length) (zero? (rem length size))    (or (and (< size length) (zero? (rem length size))) (not (< size length)) ) )
    (if (or (and (< size length) (zero? (rem length size))) (not (< size length)))
      (str/join "-" (map str/join (partition-all size replaced )))
      (let [f (first replaced)
            r (rest replaced) ]
        (str f "-" (str/join "-" (map str/join (partition-all size (str/join "" r)))))))))


;; 20220529
(defn reverse-words [words]
  (->> (str/split words #" ")
       (reverse)
       (str/join " ")))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))
