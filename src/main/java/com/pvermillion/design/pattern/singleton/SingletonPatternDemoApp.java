package com.pvermillion.design.pattern.singleton;

import com.pvermillion.design.pattern.singleton.objects.SingleObject;

public class SingletonPatternDemoApp {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        object.logMessage();

    }
}
