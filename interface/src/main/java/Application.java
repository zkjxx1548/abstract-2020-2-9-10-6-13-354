import module.*;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("小明", 300);
        Traffic bus = new Bus();
        Traffic car = new Car();
        Traffic train = new Train();
        Traffic plane = new Plane();
        bus.getTrafficByPrice(person);
        car.getTrafficByPrice(person);
        train.getTrafficByPrice(person);
        plane.getTrafficByPrice(person);

    }
}

