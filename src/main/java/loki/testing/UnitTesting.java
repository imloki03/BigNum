package loki.testing;
import loki.project.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTesting {
    @Test
    public void testAdd() {
        assertEquals("100", MyBigNumber.sum("50", "50"));

        assertEquals("146", MyBigNumber.sum("123", "23"));

        assertEquals("146", MyBigNumber.sum("23", "123"));

        assertEquals("50", MyBigNumber.sum("50", "0"));

        assertEquals("0", MyBigNumber.sum("00000", "0000000"));

        assertEquals("1", MyBigNumber.sum("00000", "0000001"));

        assertEquals("1111111110", MyBigNumber.sum("123456789", "987654321"));

        assertEquals("325235661481580913003932048148108208209198910796270609227094708268899105989380360972593988592625", MyBigNumber.sum("426246345646346463462462462462463453453453624262652436234523252352232523525235235235235252", "325235235235235266657468585685645745745745457342646346574658473745646753756856835737358753357373"));
    }
}
