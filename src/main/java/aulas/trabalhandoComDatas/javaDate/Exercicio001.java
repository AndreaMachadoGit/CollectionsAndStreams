package aulas.trabalhandoComDatas.javaDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercicio001 {


    public static void main(String[] args) {

        Exercicio001 e = new Exercicio001();

        e.checaLong(1563385317992L);


    }


    /**
     * Exercicio 1
     *
     * Você tem um epoch (formato long) converta no formato Date
     *
     * Epoch 1563385317992
     *
     * Ponto de atenção: como você está manipulando um numero do tipo long, dependendo da maneira que você estiver
     *                   manipulando essa informação, você precisa colocar a letra l no final do numero
     *
     *
     *
     * @param epoch
     * @return
     */
    public Date checaLong(long epoch) {

        Date date = new Date(1563385317992L);

        //System.out.println(date);

        Date minhaData = new Date(62,11,8); //43988400000L
        System.out.println(minhaData + " Data no formato da Date mesmo");

        System.out.println(minhaData.getTime() + " Minha data em milisegundos ");

        Date dataEmMilisegundosConvertida = new  Date(43988400000L);
        System.out.println(dataEmMilisegundosConvertida + " Convertida ");

        Date dataToCompare = new Date(1273892400000L);
        System.out.println(dataToCompare);

        boolean isAfter = minhaData.after(dataToCompare);
        System.out.println(isAfter);

        return null;
    }

    /**
     *
     * @return
     */
    public long dateToLong() {



        return 0L;
    }

}
