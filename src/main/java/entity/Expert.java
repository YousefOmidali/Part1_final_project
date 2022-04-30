package entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Arrays;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Expert extends Users {
    @Lob
    @Column(name = "photo", columnDefinition="BLOB")
    private byte[] photo;

    public Expert(String firstname, String lastname, String email, String username, String password, Status status, Date sqlTimestamp, byte[] photo) {
        super(firstname, lastname, email, username, password, status, sqlTimestamp);
        this.photo = photo;
    }

    public String toString() {
        return "Expert{" +
                "id='" + getId() + '\'' +
                "username='" + getUsername() + '\'' +
                "password='" + getPassword() + '\'' +
                "firstname='" + getFirstname() + '\'' +
                "lastname='" + getLastname() + '\'' +
                "email='" + getEmail() + '\'' +
                "status='" + getStatus() + '\'' +
                "signUptime='" + getSqlTimestamp() + '\'' +
                "photo=" + Arrays.toString(photo) +
                '}';
    }
}
