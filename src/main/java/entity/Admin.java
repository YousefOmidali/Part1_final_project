package entity;

import lombok.*;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Admin extends Users {

    public Admin(String firstname, String lastname, String email, String username, String password, Status status, Date sqlTimestamp) {
        super(firstname, lastname, email, username, password, status, sqlTimestamp);
    }

    public Admin(Long id, String firstname, String lastname, String email, String username, String password, Status status, Date sqlTimestamp) {
        super(id, firstname, lastname, email, username, password, status, sqlTimestamp);
    }
    public String toString() {
        return "Admin{" +
                "id='" + getId() + '\'' +
                "username='" + getUsername() + '\'' +
                "password='" + getPassword() + '\'' +
                "firstname='" + getFirstname() + '\'' +
                "lastname='" + getLastname() + '\'' +
                "email='" + getEmail() + '\'' +
                "status='" + getStatus() + '\'' +
                "signUptime='" + getSqlTimestamp() + '\'' +
                '}';
    }
}
