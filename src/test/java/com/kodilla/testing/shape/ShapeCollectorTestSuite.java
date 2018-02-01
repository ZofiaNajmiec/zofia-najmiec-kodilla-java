package com.kodilla.testing.shape;
import org.junit.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {}

@Test
    public void testAddFigure() {
        Square square = new Square();
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        ShapeCollector.addFigure();
        //Then
        Assert.assertEquals()
        }




//Test suite for classes of ShapeCollector
class ShapeTestSuite {
        private static int testCounter = 0;
        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }
        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }
        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
    }

