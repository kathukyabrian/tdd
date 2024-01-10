package tech.kitucode.tdd;

import org.junit.Assert;
import org.junit.Test;

public class StringSwapHelperTest {
    @Test
    public void testSingleCharacterString(){
        Assert.assertEquals("A", StringSwapHelper.swapStrings("A"));
    }

    @Test
    public void testEmptyCharacterString(){
        Assert.assertNull(StringSwapHelper.swapStrings(""));
    }

    @Test
    public void testLongString(){
        Assert.assertEquals("BRIANAB", StringSwapHelper.swapStrings("BRIANBA"));
    }

    @Test
    public void testTwoCharacterString(){
        Assert.assertEquals("AB", StringSwapHelper.swapStrings("BA"));
    }
}
