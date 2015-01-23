fn main() {
    let sum = (1..1000).filter(|&x| ((x % 5) == 0) || ((x % 3) == 0)).fold(0, |x,y| x + y);
    println!("{}", sum);
}
