package org.example.calculo;

public class Calculadora {

    public boolean validadorDeNotas(Object values) {
        String notas = values.toString();
        return notas.matches("^(10|[0-9](\\.[0-9])?)$");
    }
    /** CONVERTE PARA CALCULAR_MEDIA PARA UMA FUNÇAO QUE RECEBE AS NOTAS PARAMETRIZADAS */

    public void calcularMedia(Object[] notas) {
        double soma = 0;
        int contador = 0;

        for (Object nota : notas) {
            if (validadorDeNotas(nota)) {
                soma += Double.parseDouble(nota.toString()); //como foi a unica maneira q encontrei de somar, não esta validando em alguns cenarios
                contador++;
            } else {
                System.out.println("Erro: Nota inválida: " + nota);
            }
        }

        if (contador <= 0) {
            System.out.println("Nenhuma nota válida fornecida.");
        } else {
            double media = soma / contador;
            System.out.println("Média: " + media);
            System.out.println(media >= 6 ? "Aluno aprovado." : "Aluno reprovado.");
        }
    }
}
