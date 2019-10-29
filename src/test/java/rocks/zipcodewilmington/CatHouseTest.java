package rocks.zipcodewilmington;


import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        Cat expected = new Cat("Belly Button", new Date(1991, 3,3), 1);


        CatHouse.add(expected);

        Cat actual = CatHouse.getCatById(1);

        assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        Cat cat = new Cat("Frank", new Date(1991, 7, 12), 1);
        //add cat to list, then remove cat from list, return expected should be null
        


    }
    // TODO - Create tests for `void remove(Cat cat)`

    // add cat to list, tehn remove cat from list, return expected should be null

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        Cat expected = new Cat ("Boots", new Date(1991, 3, 3), 1);

        CatHouse.add(expected);

        Cat actual = CatHouse.getCatById(1);

        assertEquals(expected, actual);

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat cat = new Cat("Pablo", new Date(1991, 1,19),1);


    }
}