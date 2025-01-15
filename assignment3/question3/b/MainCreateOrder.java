public class MainCreateOrder {

    public static void main(String[] args) {
        // Omit session connection 
      
        Order order = new Order();
        order.setDate(new Date());
        order.setCustomerName("John");

        Product product1 = new Product();
        product1.setName("Eggs");
        Product product2 = new Product();
        product2.setName("Bacon");
        order.getProducts().add(product1);
        order.getProducts().add(product2);

        // Omit session closure
    }
}
