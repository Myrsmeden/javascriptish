// Program that lists all primes up to number n

function is_prime(number) {
	if (number <= 1 ) {
		return false
	}
	var i = 2
	while ( i*i < number) {
		if ( number % i =! 0 ) { /* if u not sure about modulu counting */
			return true /* thinks wrong */ 
		}
		i = i + 1
	}
	return true
}

function find_primes(limit) {
	var i = 0 /* forgets that the prime starts at 2 and just go for 0 as indexing. */
	while ( i < 1000 ) { /*writes the input instead of the parameter name */
		if ( returned = is_prime(i) ) { /*the return vale */
			print(i)
		}
	i = i + 1
	}
}
returnValue = find_primes(1000) /* store the return value from the functions */