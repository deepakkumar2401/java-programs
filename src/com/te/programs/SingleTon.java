package com.te.programs;

//code_period you tube channel for stream java 8 feature
class Sun {

    private static Sun sun;

    private Sun() {

    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
            return sun;
        } else {
            return sun;
        }
    }
}

public class SingleTon {
    public static void main(String[] args) {
        Sun sun1 = Sun.getSun();
        Sun sun2 = Sun.getSun();
        System.out.println(sun1 == sun2);
    }
}
