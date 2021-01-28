package com.pvermillion.design.pattern.singleton.objects;

import com.pvermillion.basic.Basic;

import java.util.ArrayList;
import java.util.List;

public class SingleObject {

    private static SingleObject instance = new SingleObject();
    private static List<Integer> numbers = new ArrayList<>();

    // Make constructor private so that this class can't be instantiated
    private SingleObject() {}

    // Get the only instance object available
    public static SingleObject getInstance() {
        return instance;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void logMessage() {
        Basic.getLogger().info("Here's an instance message");
    }

}
