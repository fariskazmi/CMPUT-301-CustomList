import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void testHasCity() {
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void testDeleteCity() {
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.delete(city);
        assertEquals(0, list.getCount());
    }

    @Test
    public void testCountCity(){
        list.addCity(new City("Halifax", "NS"));
        assertEquals(1, list.countCities());

    }

}
