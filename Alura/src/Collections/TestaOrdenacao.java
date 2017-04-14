package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {

    public static void main(String[] args) {
        
    	/*List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();

        ContaPoupanca c1 = new ContaPoupanca(400,1 ,"Caio");
        c1.deposita(1500.0);
        contas.add(c1);

        ContaPoupanca c2 = new ContaPoupanca(467,2, "Adriano");
        c2.deposita(2050.99);
        contas.add(c2);

        ContaPoupanca c3 = new ContaPoupanca(230,3, "Victor");
        c3.deposita(1070.0);
        contas.add(c3);*/
        
    	List<ContaReal> contas = new ArrayList<ContaReal>();
        Random random = new Random();

        ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), 1, "Caio");
        System.out.println(c1.getNome()+" "+c1.getSaldo());
        c1.deposita(random.nextInt(10000) + random.nextDouble());
        System.out.println(c1.getNome()+" "+c1.getSaldo());
        contas.add(c1);

        ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000),2, "Adriano");
        System.out.println(c2.getNome()+" "+c2.getSaldo());
        c2.deposita(random.nextInt(10000) + random.nextDouble());
        System.out.println(c2.getNome()+" "+c2.getSaldo());
        contas.add(c2);

        ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000),3, "Victor");
        System.out.println(c3.getNome()+" "+c3.getSaldo());
        c3.deposita(random.nextInt(10000) + random.nextDouble());
        System.out.println(c3.getNome()+" "+c3.getSaldo());
        contas.add(c3);

        Collections.sort(contas);

        for (ContaReal conta : contas) {
          System.out.println(conta.getNome());
        }
        System.out.println(contas);
  
       Collections.sort(contas);//ordena o vetor.
        //Collections.reverse(contas);//reverte a ordenação.
       //Collections.rotate(contas, 2);//Rotaciona os elementos de uma lista específica a uma distância específica.
       //Collections.shuffle(contas);//deixa a ordem aleatória.
       
       

        /*for (ContaPoupanca conta : contas) {
            System.out.println(conta.getNome());
        }*/
    }
}
