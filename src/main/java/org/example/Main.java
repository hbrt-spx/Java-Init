package org.example;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    /**
     * <h1>PROPOSTA DA ATIVIDADE</h1>
     * <p>Em uma escola, foi estabelecido que o nosso professor vai poder colocar quantas vezes ele quiser uma
     * nota de um aluno e vai ser necessário calcularmos a nota média que foi obtida
     * e mostrar se o aluno ao longo do ano conseguiu bater a média que é de 6.</p>
     *
     * <h2>REQUISITOS QUE VÃO SER AVALIADOS</h>
     * <ul>
     *     <li>O sistema deve ter uma forma do professor digitar as notas dos alunos.</li>
     *     <li>Todas essas notas vão ser armazenadas em uma parte no código.</li>
     *     <li>Calcular a média de todas essas notas.</li>
     *     <li>Mostra se ele foi aprovado ou não.</li>
     * </ul>
     */




    /* ONDE VAI SER INICIALIZADO E VERIFICAMOS SE A ATIVIDADE FOI REALIZADA */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdNotas = 0, index;

        while (qtdNotas <= 0) {
            System.out.print("Quantas provas aconteceram nesse semestre? ");
            qtdNotas = sc.nextInt();
            if (qtdNotas <= 0) {
                System.out.println("Você deve informar quantas provas aconteceram (valor maior que 0).");
            }
        }

        double[] notas = new double[qtdNotas];

        for (index = 0; index < qtdNotas; index++) {
            System.out.print("Digite a " + (index+1) + "ª nota: "); //não entendi como validar antes dele estar no sistema
            notas[index] = sc.nextDouble();
            if(notas[index] > 10 || notas[index] < 0){
                System.out.println("A nota deve ser de 0 a 10");
                index += -1;
            }


        }
        System.out.println("Média do aluno: ");


        double media = (Arrays.stream(notas).sum()/qtdNotas);
        System.out.println(media);
        if(media >= 6){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        sc.close();



    }
}