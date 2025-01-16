public class MainCreate {

    public static void main(String[] args) {
      
        // Omitting the connection statements

        session.beginTransaction();

        Customer customer = new Customer();
        customer.setName("John");
        customer.setAddress("390 Klug St");

        Professor professor = new Professor();
        professor.setOfficeNumber("CS3560");
        professor.setResearchArea("OOP");
        professor.setCustomer(customer); 

        session.save(customer);
			
		session.getTransaction().commit();
        // Omitting the session closing statements
    }
}
