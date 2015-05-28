Norbital : Nrecurrence {

	var <> offset;

*	new { |initial, offset|
		^ super.new.beginsWith_ (initial).offset_ (offset);
	}

	calculate { |i|
		^ this[i - 1].sqr + offset;
	}
	
}
