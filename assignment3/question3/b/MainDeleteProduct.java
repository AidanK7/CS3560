public class MainDeleteProduct {

    public static void main(String[] args) {
        // Omit session connection

        Product product = session.get(Product.class, 1); 

        if (product != null) {
            session.delete(product); 
        }

        // Omit session closure
    }
}
