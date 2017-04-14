package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestePerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<Integer>();
        //Collection<Integer> teste = new TreeSet<Integer>();
        //Collection<Integer> teste = new LinkedList<Integer>();
       //Collection<Integer> teste = new ArrayList<Integer>();
        long inicio = System.currentTimeMillis();

        int total = 200000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    	}
	}


