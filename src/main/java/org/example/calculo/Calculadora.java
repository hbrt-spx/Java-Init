package org.example.calculo;

import org.example.exceptions.NumberValidateException;

public class Calculadora {

    public boolean validadorDeNotas(Object values) {
        String notas = values.toString();
        if(notas.matches("^[0-9]+$")){
            return true;
        }
        throw new NumberValidateException("Invalid Format");
    }

    public int somaValores(Object[] notas){
        double soma = 0;
        for (Object nota : notas) {
            if (validadorDeNotas(nota)) {
                soma += Double.parseDouble(nota.toString());
            } else {
                System.out.println("Erro: Nota inválida: " + nota);
            }
        }
        return (int) soma;
    }


    public int calcularMedia(Object[] notas) {
        double media = 0;
        if (notas.length <= 0) {
            System.out.println("Nenhuma nota válida fornecida.");
        } else {
            media = somaValores(notas) / notas.length;
            System.out.println("Média: " + media);
            System.out.println(media >= 6 ? "Aluno aprovado." : "Aluno reprovado.");
        }
        return (int) media;
    }
}
