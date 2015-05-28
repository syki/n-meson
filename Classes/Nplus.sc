Nplus : Nrecurrence {
	
	var <> modulo;

*	new { |modulo = inf|
		^ super.new.modulo_ (modulo);
	}

	calculate { |i|
		^ (this[i - 1] + this[i - 2]) % modulo;
	}

}
