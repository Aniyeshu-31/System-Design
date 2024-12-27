package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator {
    BasePizza bpizza;

    public ExtraCheese(BasePizza bpizza) {
        this.bpizza = bpizza;
    }
    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return this.bpizza.cost() + 10;
    }
}
