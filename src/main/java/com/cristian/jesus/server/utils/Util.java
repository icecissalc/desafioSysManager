package com.cristian.jesus.server.utils;

import java.util.Arrays;

/**
 * 
 * @author Cristian Jesus
 *
 */
public class Util {

	/**
	 * 
	 * Ordena o vetor informado e retorna a quantidade de elementos contidos  
	 * no vetor cujo o valor é menor que o valor n informado
	 * @param vetor
	 * @param n
	 * @return Quantidade de elementos cujo o valor é menor que o valor n informado
	 */
	public static int countNumbers(int vetor[], int n) 
	{ 
		int contador = 0;
		
		if(null != vetor &&  vetor.length > 0) {
			Arrays.sort(vetor); 
			
			
			for (int i = 0; i < vetor.length; i++) 
			{ 
				if (vetor[i] < n) 
					contador++; 
			} 
		}
		
		return contador; 
	} 
}
