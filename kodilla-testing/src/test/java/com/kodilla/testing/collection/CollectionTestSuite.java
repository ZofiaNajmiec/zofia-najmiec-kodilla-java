package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Poczatek testu...");
    }
    @After
    public void after() {
        System.out.println("Koniec testu.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Rozpoczynamy testowanie:");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Koniec testowania.");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testEmpty = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testEmpty);
        System.out.println("Lista zawiera " + result.size() + " elementow.");
        //Then
        Assert.assertEquals(0, result.size());
        }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            System.out.println("Lista liczb nieparzystych: " + i );
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int j = 0; j < 10; j+= 2){
            evenNumbers.add(j);
            System.out.println("Lista liczb parzystych: " + j);

        }
        //When
        exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(evenNumbers, exterminator.exterminate(numbers));
    }
}
//W utworzonym pakiecie stwórz
// klasę testową (zbiór testów) CollectionTestSuite,
// a w niej napisz testy sprawdzające czy metoda filtrująca liczby nieparzyste działa poprawnie:

//  testOddNumbersExterminatorEmptyList:
// (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
// testOddNumbersExterminatorNormalList:
// (sprawdzi czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)

//Użyj również adnotacji
// @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.