package aulas.collections.map;

import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploTreeMap {

    public static void main(String[] args) {
        TreeMap<String,String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");

        System.out.println(treeCapitais);
    }
}
