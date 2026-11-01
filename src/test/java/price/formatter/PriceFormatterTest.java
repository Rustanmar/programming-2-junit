package price.formatter;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PriceFormatterTest {

    private PriceFormatter formatter;

    @BeforeEach
    void setUp(){
        formatter = new PriceFormatter();
    }

    @Test
    void testZero(){
        assertEquals("0 €", formatter.formatPrice(0));
    }

    @Test
    void testWholeNumber(){
        assertEquals("3 €", formatter.formatPrice(3));
    }

    @Test
    void testThousandSeperator(){
        assertEquals("1 000 €", formatter.formatPrice(1000));
    }

    @Test 
    void testThousandSeperatorFiveDigits(){
        assertEquals("22 345 €", formatter.formatPrice(22345));
    }

    @Test
    void testMillion(){
        assertEquals("1 000 000 €", formatter.formatPrice(1000000));
    }

    @Test
    void testDecimal(){
        assertEquals("0,01 €", formatter.formatPrice(0.01));
    }

    @Test
    void testTrailingZero(){
        assertEquals("0,10 €", formatter.formatPrice(0.10));
    }

    @Test
    void testThousandsDecimal(){
        assertEquals("1 000,24 €", formatter.formatPrice(1000.24));
    }

    @Test 
    void testRoundDown(){
        assertEquals("3,50 €", formatter.formatPrice(3.504));
    }

    @Test 
    void testRoundUp(){
        assertEquals("3,60 €", formatter.formatPrice(3.597));
    }

    @Test 
    void testRoundingThousand(){
        assertEquals("1 000 €", formatter.formatPrice(999.999));
    }


}