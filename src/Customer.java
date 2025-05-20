public class Customer {
    protected String name;

    protected Item[] shoppingBag;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(Item[] shoppingBag) {
        this.shoppingBag = shoppingBag;
    }

}
