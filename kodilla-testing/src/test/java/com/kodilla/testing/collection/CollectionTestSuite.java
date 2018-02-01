package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> testEmpty = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(testEmpty);
        System.out.println("Lista zawiera " + result.size() + " elementow.");
        //Then
        Assert.assertEquals(0, result.size());
        }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            System.out.println("Lista liczb nieparzystych: " + i );
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int j = 0; j < 10; j+= 2){
            evenNumbers.add(j);
            System.out.println("Lista liczb parzystych: " + j);

        }
        //When
        List <Integer> result = exterminator.exterminate(numbers);
        //exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(result, evenNumbers);
    }
}//drugi test do porpawy - sekcja when przypisac do result
// (doatkow usunac wszedzie ArrayList i dac List  w parmetrach metod i zmiennch lokalnych polach klas )


//W utworzonym pakiecie stwórz
// klasę testową (zbiór testów) CollectionTestSuite,
// a w niej napisz testy sprawdzające czy metoda filtrująca liczby nieparzyste działa poprawnie:

//  testOddNumbersExterminatorEmptyList:
// (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
// testOddNumbersExterminatorNormalList:
// (sprawdzi czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)

//Użyj również adnotacji
// @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.