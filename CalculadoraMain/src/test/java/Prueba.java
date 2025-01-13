/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculadoraentornos.CalculadoraEntornos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Eduar
 */
public class Prueba {
    
    public Prueba() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
        public void suma() {
            double resultado1 = CalculadoraEntornos.suma(2,1);
            assertEquals(3,resultado1);
        }
    @ParameterizedTest
    @CsvSource({
        "1,2,3",
        "2,3,5",
        "-1,-1,-2",
        "0,0,0",
        "100,200,300"
    })
    
    public void SumaParametrizada(int a, int b, int resultadoesperado) {
        assertEquals(resultadoesperado,CalculadoraEntornos.suma(a,b));
    }
}
