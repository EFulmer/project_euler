import System.IO
import Text.Read

multOf :: Int -> Int -> Bool
multOf n m = n `mod` m == 0

multsOf :: Int -> [Int] -> Bool
multsOf n ms = or $ fmap (multOf n) ms

mults :: [Int]
mults = [3, 5]

defaultNums :: [Int]
defaultNums = [1..999]

problem001CompDefault :: Int
problem001CompDefault = sum [x | x <- defaultNums, multsOf x mults]

problem001FilterDefault :: Int
problem001FilterDefault = sum $ filter (flip multsOf mults) defaultNums

problem001Filter :: Int -> Int
problem001Filter n = sum $ filter (flip multsOf mults) [1..n]

main = do
    putStrLn "--------------------------- Project Euler Problem 1 ---------------------------"
    putStrLn "Multiples of 3 and 5"
    putStr "What number? "
    num <- getLine
    maybe (putStrLn "Could not read number") (putStrLn . show . problem001Filter) (readMaybe num)
