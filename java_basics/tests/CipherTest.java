package java_basics.tests;

import java_basics.Cipher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CipherTest {


    @Test
    public void testCaesarEncrypt() {
        String plaintext = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        String actual = Cipher.caesarEncrypt(plaintext, 3);

        assertEquals(expected,actual);
    }

    @Test
    public void testAtbashEncrypt() {
        fail();
    }


}
