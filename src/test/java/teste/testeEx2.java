package teste;

import exemplul2.Calculator;
import exercitiul2.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testeEx2 {
    @Test
    void test1_fibo() {
        PerecheNumere c=new PerecheNumere(5,8);
        assertTrue(c.isFibonacci());
    }
    @Test
    void test2_fibo() {
        PerecheNumere c=new PerecheNumere(5,7);
        assertFalse(c.isFibonacci());
    }
    @Test
    void test1_cmmc() {
        PerecheNumere c=new PerecheNumere(27,8);
        assertEquals(216, c.cmmc());
    }
    @Test
    void test2_cmmc() {
        PerecheNumere c=new PerecheNumere(27,14);
        assertEquals(378, c.cmmc());
    }

}
