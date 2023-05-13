(ns codewars-kata.consecutive-strings-test
  (:require [clojure.test :refer [deftest is testing]]
            [codewars-kata.consecutive-strings :refer [longest-cons]]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "longest-cons"
    (test-assert(longest-cons ["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2), "abigailtheta")
    (test-assert(longest-cons ["ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"], 1), "oocccffuucccjjjkkkjyyyeehh")
    (test-assert(longest-cons [], 3), "")
    (test-assert(longest-cons ["itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"], 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck")
    (test-assert(longest-cons ["wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"], 2), "wlwsasphmxxowiaxujylentrklctozmymu")
    (test-assert(longest-cons ["zone", "abigail", "theta", "form", "libe", "zas"], -2), "")
    (test-assert(longest-cons ["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 3), "ixoyx3452zzzzzzzzzzzz")
    (test-assert(longest-cons ["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 15), "")
    (test-assert(longest-cons ["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 0), "")
    ))
