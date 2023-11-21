package main;

import java.util.Iterator;

public class PruebaFizzBuzz {
	public static void main(String[] args) {
		/*
		 * Desplegar los números del 1 al 100 con las condiciones de que los números
		 * múltiplos de 3 se cambien por la palabra fizz, mientras que los múltiplos de
		 * 5 se cambien por la palabra buzz y por último los números que sean múltiplos
		 * de 3 y 5 se cambien por la palabra fizzbuzz
		 */

		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
