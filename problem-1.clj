
(defn div-3-or-5 [n]
  (or (= 0 (mod n 3)) (= 0 (mod n 5))))

(defn problem-1-loop-recur [n]
  (loop [cur-sum 0
         i 1]
    (cond (>= i n) cur-sum
          :else (cond 
                  (div-3-or-5 i) (recur (+ cur-sum i) (inc i))
                  :else (recur cur-sum (inc i))))))


(defn problem-1-for [n]
  (reduce + (for [x (range 1 n)
        :let [y x]
        :when (div-3-or-5 y)]
    y)))

(defn problem-1-filter-reduce [n]
  (reduce + (filter div-3-or-5 (range n))))
