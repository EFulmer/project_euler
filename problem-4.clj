
(defn exp [a b]
  (reduce * (repeat b a)))

(defn n-digits [n]
  (range (exp 10 (dec n)) (exp 10 n)))

(defn n-products [n]
  (for [
        x (n-digits n)
        y (n-digits n)
        ]
    (* x y)
    )
  )

(defn palindrome [x] (= (-> x str seq) (-> x str seq reverse)))

(defn palindrome-prod [n]
  (last (sort 
          (filter palindrome (n-products n)))))
