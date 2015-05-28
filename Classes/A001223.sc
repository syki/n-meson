A001123 : N {

	calculate { |i|
		^ i.nthPrime - (i - 1).nthPrime;
	}
	
}
