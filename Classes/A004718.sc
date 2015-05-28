A004718 : Nrecurrence { // Per Nørgård's "Infinity Sequence"
	
*	beginsWith {
		^ [0];
	}

	calculate { |i|
		^ if (i.even) { this[i >> 1].neg } { this[i - 1 >> 1] + 1 };
	}

}
