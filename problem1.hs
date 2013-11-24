
nats = [1..]

multsOfThreeAndFive = [ x | x <- take 999 nats, mod x 3 == 0 || mod x 5 == 0 ]

main :: IO ()
main = putStrLn $ show $ sum multsOfThreeAndFive
