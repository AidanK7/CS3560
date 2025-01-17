@Entity
@Table(name = "review_db")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_db")
    private int id;

    @Column(name="comment_db")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "course_db_id")
    private Course course;

    public Review() {
        
    }
}
