public class MainDeleteOrder {

    public static void main(String[] args) {
        // Omit session connection

        Order order = session.get(Order.class, 1); 

        if (order != null) {
            session.delete(order); 
        }

        // Omit session closure
    }
}
