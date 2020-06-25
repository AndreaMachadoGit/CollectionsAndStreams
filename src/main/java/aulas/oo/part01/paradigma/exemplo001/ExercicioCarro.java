package aulas.oo.part01.paradigma.exemplo001;

public class ExercicioCarro {

    public static void main(String[] args) {
        Carro carro = new Carro("Peugeot SW",5);

        System.out.println("Número de pessoas no " + carro.getModelo() + "  : " + carro.getNumeroPessoasNoCarro());
        //incluir pessoas no carro
        System.out.println("Agora vamos incluir uma pessoa, ficamos com " + carro.incluirPessoasNoCarro() );
        System.out.println("Agora vamos remover uma pessoa, ficamos com " + carro.removerPessoasDoCarro() );





    }
}
