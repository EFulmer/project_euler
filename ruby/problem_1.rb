# one-liner
puts ((1..999).select { |n| n % 3 == 0 or n % 5 == 0 }).inject(0) { |x, y| x + y }

# slightly cleaner
mults = (1..999).select { |n| n % 3 == 0 or n % 5 == 0 }
puts mults.inject(0) { |x, y| x + y }

