package com.cristian.jesus.server.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testeDesafio2() {
		
		int vetor[] = {1,3,5,7}; 
		int n = 4; 		
		assertEquals(2,Util.countNumbers(vetor,n));
	}
	
	@Test
	public void testeVetorVazio() {
		
		int vetor[] = {}; 
		int n = 4; 		
		assertEquals(0,Util.countNumbers(vetor,n));
	}
	
	@Test
	public void testeVetorNulo() {
		
		int vetor[] = null; 
		int n = 4; 		
		assertEquals(0,Util.countNumbers(vetor,n));
	}
	
	@Test
	public void testeArgumentoZero() {
		
		int vetor[] = {1,3,5,7};  
		int n = 0; 		
		assertEquals(0,Util.countNumbers(vetor,n));
	}
	
}
