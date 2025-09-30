public class InvoiceItemTest {
    public static void main(String[] args) {
        // проверка конструктора и toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        // проверка сеттеров и геттеров
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);

        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // проверка метода getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}

class InvoiceItem {
    private String itemId;
    private String description;
    private int quantity;
    private double price;

    // конструктор
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.itemId = id;
        this.description = desc;
        this.quantity = qty;
        this.price = unitPrice;
    }

    // геттеры
    public String getId() {
        return itemId;
    }

    public String getDesc() {
        return description;
    }

    public int getQty() {
        return quantity;
    }

    public double getUnitPrice() {
        return price;
    }

    // сеттеры
    public void setQty(int newQty) {
        this.quantity = newQty;
    }

    public void setUnitPrice(double newPrice) {
        this.price = newPrice;
    }

    // метод для общей суммы
    public double getTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + itemId +
                ",desc=" + description +
                ",qty=" + quantity +
                ",unitPrice=" + price + "]";
    }
}
