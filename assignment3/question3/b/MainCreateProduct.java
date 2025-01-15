public class MainCreateProduct {

    public static void main(String[] args) {
        // Omit session connection

        Product product = new Product();
        product.setName("Orange Juice");

        session.save(product); 

        // Omit session closure
    }
}
