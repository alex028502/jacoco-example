
import org.junit.Assert;
import org.junit.Test;

import main.Main;

public class TestMain {
    @Test
    public void testMainMethod() {
        String sampleCodeword = "testword";
        Main main = new Main(sampleCodeword);
        String codeword = main.getCodeword();
        if (codeword == null) {
          codeword = "we got null back for some reason";
        }
        Assert.assertEquals(sampleCodeword, main.getCodeword());
    }
}



