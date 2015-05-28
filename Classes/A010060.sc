A010060 : Nrecurrence { // The Thue-Morse Sequence.
	
*	beginsWith {
		^ [0];
	}

	calculate { |i|
		^ if (i.even) { this[i >> 1] } { 1 - this[i - 1 >> 1] };
	}

}
