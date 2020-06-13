package pitapat.party.dongdong.dto;

import lombok.Getter;
import pitapat.party.dongdong.domain.posts.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {
    private Long id;
    private String name;
    private String description;
    private String location;
    private String owner;
    private String saleinfo;
    private LocalDateTime modifiedDate;

    // To-Do
    // Section, Image, category 추가

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.location = entity.getLocation();
        this.owner = entity.getOwner();
        this.saleinfo = entity.getSaleinfo();
        this.modifiedDate = entity.getModifiedDate();
    }
}
