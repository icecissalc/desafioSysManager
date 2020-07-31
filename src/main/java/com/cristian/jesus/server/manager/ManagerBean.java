package com.cristian.jesus.server.manager;

import java.util.ArrayList;
import java.util.List;

import com.cristian.jesus.server.model.TrainComposition;
import com.cristian.jesus.server.utils.ConstantesUtils;
import com.cristian.jesus.server.utils.Util;
import com.cristian.jesus.server.view.ImprimeDesafio;

public class ManagerBean {
	
	/**
	 * Responsável por administrar a execução da aplicação.
	 */
	public static void execute() {
		ImprimeDesafio.imprimirDesafio1(processaDesafio1());

		ImprimeDesafio.imprimirDesafio2(processaDesafio2());
		
	}
	
	private static List<Integer> processaDesafio1() {
		List<Integer> listDesatracados = new ArrayList<Integer>();
		
		TrainComposition trainComposition = new TrainComposition();
		trainComposition.atracarVagaoPelaEsquerda(7);
		trainComposition.atracarVagaoPelaEsquerda(13);
		listDesatracados.add(trainComposition.desatracarVagaoPelaDireita());
		listDesatracados.add(trainComposition.desatracarVagaoPelaEsquerda());
		
		return listDesatracados;
	}
	
	private static int processaDesafio2() {
		return Util.countNumbers(ConstantesUtils.VETOR_DESAFIO2,ConstantesUtils.ARGUMENTO_DESAFIO2);
	}

}