package pitapat.party.dongdong.controller.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import pitapat.party.dongdong.dto.PostsResponseDto;
import pitapat.party.dongdong.dto.PostsSaveRequestDto;
import pitapat.party.dongdong.service.posts.PostsService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    // Save Posts
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    // Get one Post by id
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    // Get all posts ordered by desc
    @GetMapping("/api/v1/posts")
    public List<PostsResponseDto> findAllDesc() {
        return postsService.findAllDesc();
    }
}
