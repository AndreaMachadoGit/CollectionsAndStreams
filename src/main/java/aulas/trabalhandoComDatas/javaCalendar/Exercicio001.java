package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercicio001 {

    public static void main(String[] args) {
        //Calendar dataVencimento = "06/15/2020";

        Calendar c = new GregorianCalendar(2020,05,18);

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        Calendar dataDeVencimentoInicial = new  GregorianCalendar(2020,05,18);


        c.add(Calendar.DATE,10);
        System.out.printf("%tF\n",  c);
        System.out.println(c.get(Calendar.DAY_OF_WEEK) + " o dia de vencimento será " );

        if (c.get(Calendar.DAY_OF_WEEK) == 7) {
            c.add(Calendar.DATE,2);
        } else if (c.get(Calendar.DAY_OF_WEEK)  == 1) {
            c.add(Calendar.DATE,1);
        }
        //System.out.println("Data de vencimento : " + c);

        System.out.printf("%tF\n",  c );
        //Calendar vencimentoCalendar = Calendar.getInstance();
                //.   dataVencimento;

        //int compareCase2 = (c.  - dataDeVencimentoInicial);
        int dias = c.get(Calendar.DAY_OF_YEAR) -
                dataDeVencimentoInicial.get(Calendar.DAY_OF_YEAR);
        System.out.println("o cliente tem esses dias para pagar " + dias);
    }
}
