public class MainDelete {

    public static void main(String[] args) {
        // Omiting the session connection statements
        session.beginTransaction();

        Customer customer = session.get(Customer.class, 1); 

        if (customer != null) {
            if (customer.getProfessor() != null) {
                Professor professor = customer.getProfessor();
                session.delete(professor);
            }

            session.delete(customer);
        }

        session.getTransaction().commit();
        
        // Omit the session closing statements
    }
}
