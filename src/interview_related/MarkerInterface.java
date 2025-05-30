package interview_related;

class WasherMan {
    void wash(Object object) {
        if (object instanceof Washable)
            System.out.println(object.getClass().getSimpleName() + ":is washable");
        else
            System.out.println(object.getClass().getSimpleName() + ":is not washable");
    }
}

class Car implements Washable {

}

class Bike implements Washable {

}

class Mobile {

}

//Marker Interface
interface Washable {

}


public class MarkerInterface {

    public static void main(String[] args) {
        WasherMan washerMan = new WasherMan();
        washerMan.wash(new Car());
        washerMan.wash(new Bike());
        washerMan.wash(new Mobile());
    }
}
