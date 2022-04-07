import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void isPrime() {
        var prime1 = new PrimeNumbers();
        assertTrue(prime1.isPrime(1));
        assertTrue(prime1.isPrime(7));
        assertTrue(prime1.isPrime(2));
        assertTrue(prime1.isPrime(5));
        assertTrue(prime1.isPrime(19));
        assertTrue(prime1.isPrime(12));
    }
}