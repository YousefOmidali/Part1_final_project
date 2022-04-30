package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends Users {
    private Wallet wallet;
    @OneToMany(mappedBy = "Customer")
    private List<Comment> comment;
    @OneToMany
    private List<Order> orders;

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", signUptime='" + getSqlTimestamp() + '\'' +
                ", wallet=" + wallet +
                ", comment=" + comment +
                ", orders=" + orders +
                '}';
    }
}
