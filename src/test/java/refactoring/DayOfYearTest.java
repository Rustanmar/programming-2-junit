package refactoring;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfYearTest {
    
    @Test 
    void testFirstDayOfYear(){
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2026));
    }

    @Test   
    void testLastDayOfJan(){
        assertEquals(31, DayOfYear.dayOfYear(1, 31, 2026));
    }

    @Test 
    void testFirstDayOfFebruary(){
        assertEquals(32, DayOfYear.dayOfYear(2, 1, 2026));
    }

    @Test 
    void testLastDayOfTheYear(){
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2026));
    }

    @Test 
    void testLeapYear(){
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2024));
    }

    @Test 
    void testNextDayInLeapYear(){
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
    }

    @Test 
    void testLastDayOfTheLeapYear(){
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2024));
    }

    @Test 
    void testCenturyLeapYearRule(){
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 1900));
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 1900));
    }

    @Test 
    void testFourCenturyLeapYearRule(){
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2000));
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2000));
    }
}
