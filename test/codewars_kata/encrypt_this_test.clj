(ns codewars-kata.encrypt-this-test
  (:require
   [clojure.test :refer [deftest is]]
   [codewars-kata.encrypt-this :refer [encrypt-text]]))

(deftest encrypt-text-test
  (is (= (encrypt-text "Hello") "72olle"))
  (is  (= (encrypt-text "good" ) "103doo"))
  (is  (= (encrypt-text "hello world") "104olle 119drlo")))
