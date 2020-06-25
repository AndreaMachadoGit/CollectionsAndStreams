package aulas.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listExample {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Andrea");
        nomes.add("Celso");
        nomes.add("Pedro");
        nomes.add("Giovani");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

    }

}


