package Collections;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		  ContaReal c1 = new ContaCorrente(0, 0, null);
          c1.deposita(10000);

          ContaReal c2 = new ContaCorrente(0, 0, null);
          c2.deposita(3000);

          // cria o mapa
          Map<String, ContaReal> mapaDeContas = new HashMap<String, ContaReal>();

          // adiciona duas chaves e seus valores
          mapaDeContas.put("diretor", c1);
          mapaDeContas.put("gerente", c2);

          // qual a conta do diretor?
          ContaReal contaDoDiretor = (ContaReal) mapaDeContas.get("diretor");
          System.out.println(contaDoDiretor.getSaldo());

	}

}
