package pitapat.party.dongdong.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pitapat.party.dongdong.domain.posts.Posts;
import pitapat.party.dongdong.domain.posts.PostsRepository;
import pitapat.party.dongdong.dto.PostsResponseDto;
import pitapat.party.dongdong.dto.PostsSaveRequestDto;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    // Save Posts
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    // Find Posts by post's id
    @Transactional
    public PostsResponseDto findById (Long id) {
        System.out.println("id is " + id);
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 포스트가 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }

    // Find all Posts order by desc
    @Transactional(readOnly=true)
    public List<PostsResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(PostsResponseDto::new)
                .collect(Collectors.toList());
    }
}
