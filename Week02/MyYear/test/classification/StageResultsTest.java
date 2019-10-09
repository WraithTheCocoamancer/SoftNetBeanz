/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mhill9
 */
public class StageResultsTest {
    
    private StageResults empty; // will have no credits and no marks
    private StageResults full; // will have 120 credits and marks
    private StageResults halfFull; // will have 60 credits and some marks
    
    public StageResultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    // empty - object that starts with default values
    empty = new StageResults();

    // full - object with 120 credits-worth of marks but no
    // initial stage2Average
    full = new StageResults();
    full.addModuleMark(120, 50.0);

    // halfFull - object with 60 credits worth of marks and
    // no initial stage2Average
    halfFull = new StageResults(); 
    halfFull.addModuleMark(60, 50.0);
    }

    
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testIsComplete() {
        fail("Test not yet implemented"); 
    }

    @Test
    public void testResetValues() {
       System.out.println("Testing resetValues");

    // Set the state of the 'full' object to zeroes
    full.resetValues();

    // Set expected results
    int expIntResult = 0;
    double expDoubleResult = 0.0;

    // Now check each attribute to test that the reset has worked
    assertEquals("credits", expIntResult, full.getTotalCredits());
    assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

    // Put the 'full' object back to its original state
    full.addModuleMark(120, 50.0); 
    }

    @Test
    public void testAddModuleMark() {
        
        System.out.println("Testing Add Functionality");
    int expIntResult = 10;
    double expDoubleResult = 35.0;
        
        empty.addModuleMark(10, 35);
        
    assertEquals("credits", expIntResult, empty.getTotalCredits());
    assertEquals("total", expDoubleResult, empty.getTotalMarks(), 0.0);
    empty.resetValues();
    
    expIntResult = 20;
    expDoubleResult = 70.0;
        empty.addModuleMark(20, 35);
        
    assertEquals("credits", expIntResult, empty.getTotalCredits());
    assertEquals("total", expDoubleResult, empty.getTotalMarks(), 0.0);
    empty.resetValues();
    
    expIntResult = 40;
    expDoubleResult = 140.0;
        empty.addModuleMark(40, 35);
        
    assertEquals("credits", expIntResult, empty.getTotalCredits());
    assertEquals("total", expDoubleResult, empty.getTotalMarks(), 0.0);
    empty.resetValues();
    }

    @Test
    public void testCalculateAverageSoFar() {
        // Test with no credits and no marks
    assertEquals("empty", 0.0, empty.calculateAverageSoFar(), 0.0); 
    // Test with 120 credits all at 50%
    assertEquals("full @ 50%", 50.0, full.calculateAverageSoFar(), 0.0); 
    // Test with 120 credits all at 100%
    full.resetValues();
    full.addModuleMark(120, 100.0);
    assertEquals("full @ 100%", 100.0, full.calculateAverageSoFar(), 0.0); 
    full.resetValues(); 
    }

    @Test
    public void testPredictClass() {
        System.out.println("predictClass");

    // Array to hold the stage 3 marks
    double[] marks = {0.00, 50.00, 50.00, 100.00, 39.99, 40.0,
     49.99, 50.0, 59.99, 60.0, 69.99, 70.0, 99.99, 35.67,
     44.22, 56.39, 64.00, 76.80};
    // Array of corresponding classifications with no stage 2 marks
    String[] expResult1 = {"No marks!", "Lower 2nd",
     "Lower 2nd", "1st", "FAIL", "3rd", "3rd", "Lower 2nd",
     "Lower 2nd", "Upper 2nd", "Upper 2nd", "1st", "1st",
     "FAIL", "3rd", "Lower 2nd", "Upper 2nd", "1st"};

    // Run tests with no stage 2 average
    for (int count = 0; count < marks.length; count++) {
     full.resetValues();
     full.addModuleMark(120, marks[count]);
     assertEquals("120 credits, mark = " + marks[count], expResult1[count],
     full.predictClass());
    } 
    }
    
}
