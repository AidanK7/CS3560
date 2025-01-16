public class MainCreateProduct {

    public static void main(String[] args) {
        // Omit session connection
        session.beginTransaction();

        Product product = new Product();
        product.setName("Orange Juice");

        session.save(product); 

        session.getTransaction().commit();
        
        // Omit session closure
    }
}
