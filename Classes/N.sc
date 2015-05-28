N : Pattern {

	at { |i|
		^ this.calculate (i);
	}

	calculate { |i|
		^ this.subclassResponsibility (thisMethod);	
	}

	copySeries { |first, second, last|
		^ Array.fill (last + 1, this[_]).copySeries (first, second, last);
	}

	embedInStream { |event|
		var i = 0;
		loop {
			this[i].yield;
			i = i + 1;
		};
	}

}
