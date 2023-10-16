import org.example.NumDigitos;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumDigitosTest {

    ArrayList data;

    static NumDigitos numD;
    int num= 9999999;

    @BeforeAll
    public static void setup(){
        numD = new NumDigitos();
    }

    @BeforeEach
    public void guardarResltado(){
        data = new ArrayList<>();
        System.out.println("@Before: executedBeforeEach");
    }

    @Test
    public void numDigitosTest(){
        int expect = 8;
        int actual = numD.verDigitos(num);
        assertEquals(expect, actual, "Erro");

    }

}
