(ns codewars-kata.count-smileys-test
  (:require [clojure.test :refer [deftest is]])
  (:require [codewars-kata.count-smileys :refer [count-smile]]))

(deftest count-smile-test
  (is (= (count-smile [])  0))
  (is (= (count-smile [":)"  ";("  ";}"  ":-D"])  2))
  (is (= (count-smile [";]"  ":["  ";*"  ":$"  ";-D"])  1))
  (is (= (count-smile [":)" ":(" ":D" ":O" ":;"])  2))
  (is (= (count-smile [":-)" ";~D" ":-D" ":_D"])  3))
  )
