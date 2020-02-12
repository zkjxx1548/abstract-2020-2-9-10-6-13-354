import module.*;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("小明", 200);
        Traffic bus = new Bus();
        Traffic car = new Car();
        Traffic train = new Train();
        Traffic plane = new Plane();
        Traffic[] traffics = new Traffic[] {bus, car, train, plane};

        getTrafficByPrice(traffics, person);
    }

    public static void getTrafficByPrice(Traffic[] traffics, Person person) {
        String res = "";
                //String.format("%s可以选择乘坐", person.getName());
        for (Traffic traffic : traffics) {
            if (person.getMoney() >= traffic.getPrice()) {
                if (res.equals("")) {
                    res += traffic.getClass().getSimpleName();
                } else {
                    res += ("或" + traffic.getClass().getSimpleName());
                }
            }
        }
        if (res.equals("")) {
            System.out.println(String.format("%s钱不够，无法乘坐交通工具", person.getName()));
        } else {
            System.out.println(String.format("%s可以乘坐%s。", person.getName(), res));
        }
    }
}

