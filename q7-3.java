import java.util.Date;

public class Person {

    private int name;
    private DriverLicense driverLicense;

    public Person(int name, DriverLicense driverLicense) {
        this.name = name;
        this.driverLicense = driverLicense;
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
