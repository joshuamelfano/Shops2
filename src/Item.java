public class Item {
    protected Product p;
    protected int qty;

    public Item(Product p, int qty) {
        this.p = p;
        this.qty = qty;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
