import org.example.calculo.Calculadora;
import org.junit.jupiter.api.Test;

// https://dev.to/andersonleite/testes-unitarios-com-junit-no-java-26lf
public class CalculadoraTeste {

    private int numero_1;
    private int numero_2;

    @Test
    // ele é professor
    void calcularMedia () {
        Calculadora calculadora = new Calculadora();

         // ele lançou as notas
        calculadora.calcularMedia(new Object[]{"a", "a", "e", "a"});   //Não estou conseguindo validar em caso de 0 notas
        calculadora.calcularMedia(new Object[]{});   //Não estou conseguindo validar em caso de 0 notas
        calculadora.calcularMedia(new Object[]{10, 6, 8, 10});
        calculadora.calcularMedia(new Object[]{10, 8, 20});
        calculadora.calcularMedia(new Object[]{6, 5, 8, 9, 10});
        calculadora.calcularMedia(new Object[]{1, "A"});
        calculadora.calcularMedia(new Object[]{11, 6});
    }


}
