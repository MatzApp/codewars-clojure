(ns codewars-kata.pangram
  (:require [clojure.string :refer [lower-case index-of]]))

;;  mortonfox, rthoward
;;(ns Pangram
;;  (:require
;;    [clojure.string :refer [lower-case]] 
;;    [clojure.set :refer [subset?]]))
;;(defn pangram?
;;  [s]
;;  (subset? 
;;    (set "abcdefghijklmnopqrstuvwxyz") 
;;    (set (lower-case s))))

(defn pangram?
  [s]
  ; TODO
  (let [lowered-s (lower-case s)
        alphabet (vec "abcdefghijklmnopqrstuvwxyz")]
    (every? #(some? (index-of lowered-s %)) alphabet)
    )
  )
