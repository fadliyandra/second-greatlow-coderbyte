package second_greatlow_coderbyte;

import java.util.*;
import java.io.*;

public class main {

	public static String SecondGreatLow(int[] arr) {

		/* Use o objeto Set para excluir os numeros repetidos */
		
		Set<Integer> arrSet = new HashSet<>();
		
		for (int a:arr) {
			arrSet.add(a);
		}
		
		/* Crie um novo Array, baseado no objeto Set, sem os numeros repetidos */
		
		Integer[] arrNovo = arrSet.toArray(new Integer[arrSet.size()]);
		
		/* Ordene o Novo Array */
		
		Arrays.sort(arrNovo);

		/* Retorne a segundo e o pneultimo elemento */
		
		return arrNovo[1] + " " + arrNovo[arrNovo.length -2];
	}

	public static void main(String[] args) {

		int[] s = { 7, 7, 12, 98, 106 };

		// Scanner s = new Scanner(System.in);
		System.out.print(SecondGreatLow(s));

	}

}
