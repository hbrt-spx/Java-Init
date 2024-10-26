import org.example.calculo.Calculadora;
import org.example.exceptions.NumberValidateException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


// https://dev.to/andersonleite/testes-unitarios-com-junit-no-java-26lf
public class CalculadoraTeste {

    @Test
    void calcularMedia () {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.calcularMedia(new Object[]{10, "1", "1", "4"}));
    }

    @Test
    void validadorDeNotas() {
        Calculadora calculadora = new Calculadora();
        Assertions.assertThrows(NumberValidateException.class, () -> calculadora.validadorDeNotas(new Object[]{"A", 10, 10, 10}));
    }

    @Test
    void somaValores(){
        Calculadora calculadora = new Calculadora();
        assertEquals(50, calculadora.somaValores(new Object[]{10, 10, 30})); // Tive que mudar a regex, pois se a soma fosse maior que 10, ou os numeros, caia na exception.
    }


}
