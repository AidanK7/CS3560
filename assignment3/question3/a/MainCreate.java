public class MainCreate {

    public static void main(String[] args) {
      
        // Omitting the connection statements

        Customer customer = new Customer();
        customer.setName("John");
        customer.setAddress("390 Klug St");

        Professor professor = new Professor();
        professor.setOfficeNumber("CS3560");
        professor.setResearchArea("OOP");
        professor.setCustomer(customer); 

        // Omitting the session save and session closing statements
    }
}
