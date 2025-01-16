import java.util.Date;

public class Person {

    private int name;

    public Person(int name, DriverLicense driverLicense) {
        this.name = name;
    }

}

public class DriverLicense {

    private int number;
    private Date expiration;

    public DriverLicense() {
        this.number = 0;
        this.expiration = null;
    }

}
