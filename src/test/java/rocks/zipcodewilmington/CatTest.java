package rocks.zipcodewilmington;

import static org.junit.Assert.*;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
       String expected = "Harvey";
        Cat cat = new Cat("Default", new Date(1992,02,20),001);


       cat.setName(expected);
       String actual = cat.getName();

       assertEquals(expected,actual);
    }
    @Test
    public void setBirthDateTest(){
        Date expected = new Date(1911,02,19);
        Cat cat = new Cat("Default", new Date(1919,10,31), 002);

        cat.setBirthDate((expected));
        Date actual = cat.getBirthDate();

        assertEquals(expected, actual);
    }
    @Test
    public void speakTest(){
        Cat cat = new Cat("Obie", new Date(2018,8,15),003);
        String expected = "meow!";

        String actual = cat.speak();

        assertEquals(expected,actual);
    }
    @Test
    public void eatTest(){
        Cat cat = new Cat("Eddie", new Date(2018, 8, 15),002);
        Integer expected = 488;
        for( int i = 0; i < expected; i++){
            cat.eat(new Food());
        }
        Integer actual = cat.getNumberOfMealsEaten();
        assertEquals(expected, actual);
    }
    @Test
    public void getIdTest(){
       Integer expected = 003;
       Cat cat = new Cat("Lion", new Date(1010,01,10), expected);

      Integer actual = cat.getId();
      assertEquals(expected, actual);
    }
    @Test
    public void animalTest(){
        Cat cat = new Cat ("Ava", new Date(3000, 3,30), 004);
        assertTrue(cat instanceof Animal);
    }

    public void mammalTest(){
        Cat cat = new Cat ("Poppy", new Date(2014, 9, 17), 005);
        assertTrue(cat instanceof Mammal);
    }
}

