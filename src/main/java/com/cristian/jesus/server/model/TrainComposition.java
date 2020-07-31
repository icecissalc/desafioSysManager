package com.cristian.jesus.server.model;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * @author Cristian Jesus
 *
 */
public class TrainComposition {
	
    private final Deque<Integer> vagoes = new LinkedList<>();
    
    /**
     * Atraca o vagão informado pelo lado esquerdo, não permite repetição de id de vagão.
     * @param idVagao
     */
    public void atracarVagaoPelaEsquerda(int idVagao) {
    	if(!vagoes.contains(idVagao)) {
    		vagoes.addFirst(idVagao);
    	}
    }

    /**
     * Desatraca o primeiro vagão do lado esquerdo.
     * 
     * @return o id do vagão desatracado
     * @throws IndexOutOfBoundsException caso não tenha vagão para desatracar
     */
    public int desatracarVagaoPelaEsquerda() throws IndexOutOfBoundsException {
    	if (!vagoes.isEmpty()) {
    		return vagoes.pollFirst();
    	} else {
    		throw new IndexOutOfBoundsException("Não há vagões disponíveis para desatracar");
    	}
    }

    /**
     * Atraca o vagão informado pelo lado direito, não permite repetição de id de vagão.
     * @param idVagao
     */
    public void atracarVagaoPelaDireita(int idVagao) {
    	if(!vagoes.contains(idVagao)) {
    		vagoes.addLast(idVagao);
    	}	
    }

    /**
     * Desatraca o primeiro vagão do lado direito.
     * 
     * @return o id do vagão desatracado
     * @throws IndexOutOfBoundsException caso não tenha vagão para desatracar
     */
    public int desatracarVagaoPelaDireita() throws IndexOutOfBoundsException {
    	if (!vagoes.isEmpty()) {
    		return vagoes.pollLast();
    	} else {
    		throw new IndexOutOfBoundsException("Não há vagões disponíveis para desatracar");
    	}
    }
    
    /**
     * Desmonta o trem
     */
    public void limparTrem() {
    	vagoes.clear();
    }    
}
