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


    public static void calcularMedia() {

    }

    /* ONDE VAI SER INICIALIZADO E VERIFICAMOS SE A ATIVIDADE FOI REALIZADA */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N, i;

        System.out.print("Quantas provas aconteceram nesse semestre? ");
        N = sc.nextInt();

        double[] notas = new double[N];
        
        for (i = 0; i < N; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            if(notas[i] > 10){
                System.out.println("A nota deve ser de 0 a 10");
                i = -1;
            }


        }
        System.out.println("Média do aluno: ");
            System.out.println(Arrays.stream(notas).sum()/N);

            if(Arrays.stream(notas).sum()/N >= 6){
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        sc.close();



    }
}