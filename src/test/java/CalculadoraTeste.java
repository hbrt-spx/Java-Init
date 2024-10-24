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
        assertEquals(50, calculadora.somaValores(new Object[]{10, 10, 30})); // Tive que mudar a regex, pois se a soma fosse maior que 10, ou os numeros, caia na exception.
    }


}
