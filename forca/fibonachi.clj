(defn fib [x] 
    (if (> x 1)
        (+ (fib(- x 2)) (fib(- x 1)))
        x
    )
)
