import org.example.calculo.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


// https://dev.to/andersonleite/testes-unitarios-com-junit-no-java-26lf
public class CalculadoraTeste {

    @Test
    void calcularMedia () {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.calcularMedia(new Object[]{10, 10, 10, 10}));
    }

    @Test
    void validadorDeNotas (){
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.validadorDeNotas(new Object[]{"A"}));
    }

    @Test
    void somaValores(){
        Calculadora calculadora = new Calculadora();
        assertEquals(9, calculadora.somaValores(new Object[]{1, 3, 5})); // Se eu passar valores que a soma da maior do que 10 esta caindo na exception por conta da regex
    }


}
