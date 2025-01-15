@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="officeNumber", nullable = false)
    private String officeNumber;

    @Column(name="researchArea", nullable = false)
    private String researchArea;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
