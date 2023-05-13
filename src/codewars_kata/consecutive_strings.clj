(ns codewars-kata.consecutive-strings 
  (:require [clojure.string :as string]))

(comment
  (def ^:private strarr ["tree", "folding", "trash", "blue", "abcdef", "uvwxyz"])
  )

(defn longest-cons
  "6級の問題。
  文字列の配列`strarr`を受け取り文字数が最大になる文字列の組み合わせを返す。
  組み合わせは`k`の数だけ連結することとし、同じ文字数になる組み合わせがある場合は、一つ目の文言の次以降にある最も近い組み合わせとする。
  なお、文字列の連結先は連結元よりも後ろにあるものとする。
  例：
  `strarr` [\"abc\" \"defg\" \"hijk\" \"lmno\"]
  `k` 2
  文字数が最大になる2つ連結した組み合わせは `defghijk`、`defglmno`、`hijklmno`の3つとなる。
  この場合、配列の一番手前にある組み合わせとして`defghijk`となる。
  "
 [strarr k]
  (reduce
    #(if
       ;; バブルソート的に比較していく
       (> (count %2) (count %1)) %2 %1)
       ""
       (map #(string/join "" %1)
            ;; k個ずつの組み合わせを後方に向かって作る
            (partition k 1 strarr))))
