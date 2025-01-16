public class MainDeleteOrder {

    public static void main(String[] args) {
        // Omit session connection
        session.beginTransaction();

        Order order = session.get(Order.class, 1); 

        if (order != null) {
            session.delete(order); 
        }

        session.getTransaction().commit();			
        
        // Omit session closure
    }
}
