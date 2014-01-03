
(defn problem-1-loop-recur [n]
  (loop [cur-sum 0
         i 1]
    (cond (> i n) cur-sum
          :else (cond 
                  (or (= 0 (mod i 3)) (= 0 (mod i 5))) (recur (+ cur-sum i) (inc i))
                  :else (recur cur-sum (inc i))))))
