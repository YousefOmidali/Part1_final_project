package entity;

import lombok.*;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date sqlTimestamp;

    public Users(String firstname, String lastname, String email, String username, String password, Status status, Date sqlTimestamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.status = status;
        this.sqlTimestamp = sqlTimestamp;
    }

}
