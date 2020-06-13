package pitapat.party.dongdong.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pitapat.party.dongdong.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=50, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String location;

    @Column(length=255, nullable = false)
    private String owner;

    @Column(columnDefinition = "TEXT")
    private String saleinfo;

    // To-Do
    // Section, Image, category 추가

    @Builder
    public Posts(String name, String description, String location, String owner, String saleinfo) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.owner = owner;
        this.saleinfo = saleinfo;
    }
}