package com.general;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DCP005<T, U, R> {

	public Function<BiFunction<T, U, R>, R> cons(T a, U b) {
		Function<BiFunction<T, U, R>, R> pair = f -> f.apply(a, b);
		return pair;
	}

}
