package pitapat.party.dongdong.domain.account;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "nick", columnNames = "nick")})
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String nick;

    @Column(length = 30)
    private String phone;

    @Column(columnDefinition = "boolean default false")
    private Boolean isPortalAuthenticated;

    @Column(length = 100, nullable = false)
    private String portalEmail;

    @Builder
    public User(String username, String password, String nick, String phone, Boolean isPortalAuthenticated,
                String portalEmail) {
        this.username = username;
        this.password = password;
        this.nick = nick;
        this.phone = phone;
        this.isPortalAuthenticated = isPortalAuthenticated;
        this.portalEmail = portalEmail;
    }
}
