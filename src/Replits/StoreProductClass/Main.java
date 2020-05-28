package Replits.StoreProductClass;

public class Main   //Created at: 2:36 PM - May, 16, 2020
{
    public static void main(String[] args)
    {
        StoreProduct product1 = new StoreProduct("Patato", 2, "Food", true, 10);
        System.out.println(product1.label + " " + product1.category + " " + product1.price + " " + product1.stock + "" + product1.hasExpiration);
        StoreProduct product2 = new StoreProduct("Box", 1, 10);
        System.out.println(product2.label + " " + product2.category + " " + product2.price + " " + product2.stock + " " + product2.hasExpiration);
        StoreProduct product3 = new StoreProduct("Cutter", 5);
        System.out.println(product3.label + " " + product3.price + " " + product3.stock);
        StoreProduct product4 = new StoreProduct("Cup", 1, "Houseware", false);
        System.out.println(product4.label + " " + product4.category + " " + product4.price + " " + product4.hasExpiration);

        product1.expired(true);
        System.out.println(product2.sale(5));
        System.out.println(product3.getDiscountedPrice(0.45));
        System.out.println(product2.stock);

    }
}
