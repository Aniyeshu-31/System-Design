package DecoratorDesignPattern;

public class Pizza {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Margerhita());
        System.out.println(pizza.cost());
    }
}
