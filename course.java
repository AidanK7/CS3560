@Entity
@Table(name = "course_db")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_db")
    private int id;

    @Column(name="title_db")
    private String title;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Course() {
        
    }
}
