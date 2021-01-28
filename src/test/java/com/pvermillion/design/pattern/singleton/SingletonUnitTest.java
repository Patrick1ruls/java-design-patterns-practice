package com.pvermillion.design.pattern.singleton;

import com.pvermillion.design.pattern.singleton.objects.SingleObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class SingletonUnitTest {

    @Test
    void test() {
        List<SingleObject> objects = add10ObjectInstancesToList();
        addNumbersToObjects(objects);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(objects.get(0).getNumbers());
        objects.get(1).logMessage();
        assertEquals(objects.get(8).getClass().getName(), "com.pvermillion.design.pattern.singleton.objects.SingleObject");
        assertEquals(objects.get(7).getNumbers(), list);
    }

    private List<SingleObject> add10ObjectInstancesToList() {
        List<SingleObject> objects = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            objects.add(SingleObject.getInstance());
        }
        return objects;
    }

    private void addNumbersToObjects(List<SingleObject> objects) {
        Integer j = 1;
        for(SingleObject testObject : objects) {
            testObject.addNumber(j);
            j++;
        }
    }
}
