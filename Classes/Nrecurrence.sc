Nrecurrence : N { // Abstract superclass for cached sequences like recurrence relations.
	
	var <> cache;

*	new {
		^ super.new.cache_ (Array.newClear (0x10000)).beginsWith_ (* this.beginsWith);
	}

*	beginsWith {
		^ [];
	}

	beginsWith_ { |... values|
		values.do { |value, i| cache[i] = value };
	}

	at { |i|
		cache [i] ?? {
			if (i >= cache.size) {
				cache = cache.growClear (cache.size + 0x10000);
			};
			cache [i] = this.calculate (i);
		};
		^ cache [i];
	}

}
