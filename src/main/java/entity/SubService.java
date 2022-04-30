package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String description;
    private Long basePrice;
    @ManyToOne
    private Service service;
    @ManyToOne
    private Expert expert;
}
