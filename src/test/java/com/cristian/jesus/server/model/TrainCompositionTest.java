package com.cristian.jesus.server.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TrainCompositionTest {
	
	private TrainComposition trainComposition;
	
	@Before
	public void setUp() {
		this.trainComposition = new TrainComposition();
	}
	
	@Test
	public void testeDesafio1() {
        this.trainComposition.atracarVagaoPelaEsquerda(7);
        this.trainComposition.atracarVagaoPelaEsquerda(13);
        System.out.println("Primeiro vagão desatracado pelo lado direito: " + this.trainComposition.desatracarVagaoPelaDireita()); 
        System.out.println("Primeiro vagão desatracado pelo lado esquerdo: " + this.trainComposition.desatracarVagaoPelaEsquerda());
        
	}
	
	@Test
	public void testeDesatracarPelaDireita() {
        this.trainComposition.atracarVagaoPelaEsquerda(7);
        this.trainComposition.atracarVagaoPelaEsquerda(13);
        assertEquals(7,this.trainComposition.desatracarVagaoPelaDireita());
	}
	
	@Test
	public void testeDesatracarPelaEsquerda() {
        this.trainComposition.atracarVagaoPelaEsquerda(7);
        this.trainComposition.atracarVagaoPelaEsquerda(13);
        assertEquals(13,this.trainComposition.desatracarVagaoPelaEsquerda());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testeDesatracarPelaDireitaTremVazio() {
        this.trainComposition.limparTrem();
        this.trainComposition.desatracarVagaoPelaDireita();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testeDesatracarPelaEsquerdaTremVazio() {
        this.trainComposition.limparTrem();
        this.trainComposition.desatracarVagaoPelaDireita();
	}
	
}
