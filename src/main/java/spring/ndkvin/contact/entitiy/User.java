package spring.ndkvin.contact.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    private String username;

    private String password;

    private String name;

    @Column(name = "token_expired_at")
    private Long tokenExpireAt;

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;
}
