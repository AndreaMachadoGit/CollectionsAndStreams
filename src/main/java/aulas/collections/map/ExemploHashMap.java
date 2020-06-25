package aulas.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String,Integer> campeoesMundialFifa = new HashMap<>();

        //Incluir valores nos elementos do Map
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Italia",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra",1);
        campeoesMundialFifa.put("Espanha",1);
        campeoesMundialFifa.put("bla",null);
        System.out.println(campeoesMundialFifa);

        //Alterar o valor de um elemento
        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);

        //Recuperar o valor de um elemento
        System.out.println(campeoesMundialFifa.get("França"));

        //Retorna se possui a chave (boolean)
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove um elemento através da chave
        System.out.println(campeoesMundialFifa.remove("França"));

        //Verifica se possui o valor
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.println(campeoesMundialFifa);
        //Retorna o tamanho da hashMap
        System.out.println(campeoesMundialFifa.size());

        //formas de navegação
        // por entrySet (retorna um Set de um objeto Entry que tem alguns métodos como getKey(), getValue()
        for (Map.Entry<String,Integer> nomeEntry : campeoesMundialFifa.entrySet()){
            System.out.println(nomeEntry.getKey() + " --- " + nomeEntry.getValue());
        }

        //Por keySet (retorna um set com as chaves)
        //para recuperar os valores usar get(key) dentro do for
        for (String chave : campeoesMundialFifa.keySet()){
            System.out.println(chave + " ---- usando set "+ campeoesMundialFifa.get(chave));
        }

    }
}
