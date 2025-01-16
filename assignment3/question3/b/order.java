@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="date", nullable = false)
    private Date date;

    @Column(name="customerName", nullable = false)
    private String customerName;

    @ManyToMany
    @JoinTable(
        name = "order_detail",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    public Order() {
        
    }

}
