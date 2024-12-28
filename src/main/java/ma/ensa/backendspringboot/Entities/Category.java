package ma.ensa.backendspringboot.Entities;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categorie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "products")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorie")
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "cat", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Product> products;

}
