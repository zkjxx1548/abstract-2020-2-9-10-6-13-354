package module;

public class Car implements Traffic {
    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public void getTrafficByPrice(Person person) {
        if (person.getMoney() >= getPrice()) {
            System.out.println(String.format("%s可以乘坐%s", person.getName(), getClass().getSimpleName()));
        } else {
            System.out.println(String.format("%s无法乘坐%s", person.getName(), getClass().getSimpleName()));
        }
    }

}
