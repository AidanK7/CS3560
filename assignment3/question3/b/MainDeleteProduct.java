public class MainDeleteProduct {

    public static void main(String[] args) {
        // Omit session connection
        session.beginTransaction();

        Product product = session.get(Product.class, 1); 

        if (product != null) {
            session.delete(product); 
        }

        session.getTransaction().commit();			
        
        // Omit session closure
    }
}
