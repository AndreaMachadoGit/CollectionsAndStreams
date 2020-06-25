package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com SimpleDateFormat
 */
public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss:SSS");
        String dataFormatada2 = formatter2.format(agora);

        System.out.println(dataFormatada2);

        // 14/07/2019

    }
}
