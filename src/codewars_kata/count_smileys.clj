(ns codewars-kata.count-smileys)

(comment
  (def ^:private arr [";]",":[", ";*", ":$", ";-D" ":-)"])
  )

(defn count-smile [coll]
  (let [re #"[:;][-~]?[)D]"]
    (->> (map #(re-find re %) coll)
         (filter some? )
         (count))
    ))
