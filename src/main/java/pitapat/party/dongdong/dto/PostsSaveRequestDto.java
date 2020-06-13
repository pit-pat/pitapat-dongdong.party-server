package pitapat.party.dongdong.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pitapat.party.dongdong.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String name;
    private String description;
    private String location;
    private String owner;
    private String saleinfo;

    // To-Do
    // Section, Image, category 추가

    @Builder
    public PostsSaveRequestDto(String name, String description, String location, String owner, String saleinfo) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.owner = owner;
        this.saleinfo = saleinfo;
    }

    public Posts toEntity() {
        return Posts.builder()
                .name(name)
                .description(description)
                .location(location)
                .owner(owner)
                .saleinfo(saleinfo)
                .build();
    }
}
