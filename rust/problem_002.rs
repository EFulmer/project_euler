fn fibs_to(n: u32) -> Vec<u32> {
    let mut fibs = Vec::with_capacity(2000);
    fibs.push(1);
    fibs.push(2);
    let mut last = 1;

    while fibs[last] < n {
        let (j, k) = (fibs[last], fibs[last-1]);
        fibs.push(j + k);
        last = last + 1;
    }

    fibs
}

fn main() {
    let fibs = fibs_to(4_000_000);
    let sum = fibs.iter().filter(|&n| *n % 2 == 0)
        .fold(0, |a,&b| a + b);

    println!("{}", sum);
}
