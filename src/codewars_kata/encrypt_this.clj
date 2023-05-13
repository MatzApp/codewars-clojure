(ns codewars-kata.encrypt-this 
  (:require [clojure.string :as string]))

(defn encrypt-string [text]
  (case (count text)
        0 ""
        1 (int (first text))
        2 (str (int (first text)) (rest text))
        (let [one (int (first text))
              two (last text)
              mid (subs text 2 (- (count text) 1))
              end (second text)]
          (str one two mid end))))


(defn encrypt-text [text]
  (string/join " "
                       (map #(encrypt-string %)
                            (string/split text #" "))))