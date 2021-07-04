import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {
    BinOps binOps = new BinOps();

    @org.junit.jupiter.api.Test
    void sum() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String result = binOps.sum(Integer.toBinaryString(i), Integer.toBinaryString(j));
                String expected = Integer.toBinaryString(i + j);
                Assert.assertEquals(expected, result);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void mult() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String result = binOps.mult(Integer.toBinaryString(i), Integer.toBinaryString(j));
                String expected = Integer.toBinaryString(i * j);
                Assert.assertEquals(expected, result);
            }
        }
    }
}