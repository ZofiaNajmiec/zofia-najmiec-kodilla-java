package com.kodilla.testing.shape;
import org.junit.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {
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

    @Test
    public void shouldAddFigure() {
        //Given
        Square square = new Square(3);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(shapeCollector.getFigure(0), square);
    }
    @Test
    public void shouldRemoveFigureIfAdded() {
        //Given
        Square square = new Square(3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
    }
}


