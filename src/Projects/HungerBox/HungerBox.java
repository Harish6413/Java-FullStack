package Projects.HungerBox;

import java.util.ArrayList;

interface Orderable
{
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discounts
{
    double applyDiscounts(double discount);
}

abstract class MenuItems implements Orderable,Discounts
{
    private final String name;
    private double price;
    private static int totalOrders=0;
    private String categories;

    public MenuItems(String name, double price, String categories)
    {
        this.name=name;
        this.price=price;
        this.categories=categories;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if(price>0){
            this.price = price;
        }
    }

    public static int getTotalOrders()
    {
        return totalOrders;
    }

    public static void setTotalOrders(int totalOrders)
    {
        MenuItems.totalOrders = totalOrders;
    }

    public String getCategories()
    {
        return categories;
    }

    public void setCategories(String categories)
    {
        this.categories = categories;
    }

    @Override
    public String getDescription()
    {
        return "Item Name : "+getName()+" Price : $"+getPrice();
    }

    @Override
    abstract public void prepare();

    @Override
    public double applyDiscounts(double discount)
    {
        return price - (price * discount / 100);
    }

}
class VegItems extends MenuItems
{
    private boolean isJain;
    public VegItems(String name, double price)
    {
        super(name, price, "veg");
        isJain=false;
    }

    public VegItems(String name, double price, boolean isJain)
    {
        super(name, price, "veg");
        isJain = isJain;
    }

    @Override
    public void prepare() {
        System.out.println("Your order of "+getName()+" of price "+getPrice()+" is been prepared");
        setTotalOrders(getTotalOrders()+1);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}

class NonVegItems extends MenuItems
{
    private String meatType;
    public NonVegItems(String name, double price, String categories, String meatType)
    {
        super(name, price, categories);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("Your order of "+getName()+" of price "+getPrice()+" is been prepared");
        setTotalOrders(getTotalOrders()+1);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.meatType;
    }
}
class Orders
{
    private int orderId;
    private static int orderCount=0;
    private final String customerName;
    ArrayList<MenuItems> list;
    private String status;

    Orders(String customerName)
    {
        this.customerName = customerName;
        this.list = new ArrayList<>();
        this.status = "Order Placed";;
        this.orderId=++orderCount;
    }

    public void addItems(MenuItems items)
    {
        list.add(items);
        System.out.println(items.getDescription());
    }

    public void prepareOrder()
    {
        this.status = "Preparing Order";
        for(MenuItems items:list)
        {
            items.prepare();
        }
        this.status = "Ready";
    }

    double calculateTotal()
    {
        double price=0;
        for(MenuItems items : list)
        {
            price += items.getPrice();
        }
        return price;
    }

    void generateBill(double discountPercent)
    {
        double subtotal = calculateTotal();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax  = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

}

class Restaurant
{
    private String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> o;

    public Restaurant(String name)
    {
        this.name = name;
        this.menu = new ArrayList<>();
        this.o = new ArrayList<>();
    }

    void addMenu(MenuItems items)
    {
        menu.add(items);
    }

    void showMenu()
    {
        for(int i=0;i<menu.size();i++)
        {
            System.out.println((i+1)+" : "+menu.get(i).getDescription());
        }
    }

    Orders placeOrder(String name)
    {
        Orders order1 = new Orders(name);
        o.add(order1);
        return order1;
    }

    MenuItems getItem(int index)
    {
        return menu.get(index);
    }

    void showOrder()
    {
        for (Orders order : o)
        {
            System.out.println("The order of "+order.getCustomerName()+" "+order.getStatus() +menu.get(order.getOrderId()).getDescription());
        }
    }

}

public class HungerBox {
    public static void main(String[] args) {
        System.out.println("\n  ╔═══════════════════════════════════╗");
        System.out.println("  ║       Welcome to HungerBox 🍕     ║");
        System.out.println("  ╚═══════════════════════════════════╝");
        Restaurant res = new Restaurant("Spicy Garden");

        res.addMenu(new VegItems("Paneer Butter Masala",300));
        res.addMenu(new VegItems("Tofu Butter Masala",300));
        res.addMenu(new VegItems("Soya Butter Masala",250));
        res.addMenu(new VegItems("Peanuts Butter Masala",150));
        res.addMenu(new VegItems("Paneer Butter Masala",300, true));
        res.addMenu(new NonVegItems("Chicken Butter Masala",300,"Non Veg", "Chicken"));

        res.showMenu();

        Orders ord = res.placeOrder("Harish");
        ord.addItems(res.getItem(0));
        ord.addItems(res.getItem(1));
        ord.addItems(res.getItem(2));
        ord.addItems(res.getItem(5));

        res.showOrder();
        ord.prepareOrder();
        ord.generateBill(10);
    }
}
