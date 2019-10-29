package rocks.zipcodewilmington;

import static org.junit.Assert.*;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        assertEquals(dogName, givenName);
    }
    @Test
    public void speakTest(){
        Dog dog = createDog();
        String expected = "bark!";

        String actual = dog.speak();
        assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest(){
        Dog dog = createDog(new Date(2001, 4,13));
        Date expected = new Date(1001, 4, 29);

        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        Dog dog = createDog();
        Integer expected = 7;
        for(int i = 0; i < expected; i++) {
            dog.eat(new Food());
        }
        Integer actual = dog.getNumberOfMealsEaten();
        assertEquals(expected, actual);
    }
    @Test
    public void getIdTest(){
        Integer expected = 8;
        Dog dog = createDog(expected);


        Integer actual = dog.getId();
        assertEquals(expected, actual);
    }
    @Test
    public void animalTest(){
        Dog dog = createDog();
        assertTrue(dog instanceof Animal);
    }
    @Test
    public void mammalTest(){
        Dog dog = createDog();
        assertTrue(dog instanceof Mammal);
    }
    public Dog createDog () {
        return new Dog("Basic",new Date(1990, 1, 01),010);

    }
    public Dog createDog(String name){

        return new Dog(name,new Date(1990, 1, 01),010);
    }
    public Dog createDog(Date date){
        return new Dog("Basic",date,010);
    }
    public Dog createDog(Integer id){
        return new Dog("Basic",new Date(1990, 1, 01), id);
    }
}
