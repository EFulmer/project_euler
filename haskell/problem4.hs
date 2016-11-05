{-- Project Euler Problem 4: Largest palindrome product --}

palindrome :: (Show a) => a -> Bool
palindrome a = show a == (reverse . show) a

-- take advantage of laziness and ranges; we want the biggest 3-digit 
-- product, so go from 999 to 100 instead of other way around
threeDigitProducts :: [Integer]
threeDigitProducts = [ x * y | x <- [999, 998..100], y <- [999, 998..100] ]

first3DP = maximum $ filter palindrome threeDigitProducts

main :: IO ()
main = putStrLn $ show first3DP
