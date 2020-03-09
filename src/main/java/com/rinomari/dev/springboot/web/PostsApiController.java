package com.rinomari.dev.springboot.web;

import com.rinomari.dev.springboot.domain.posts.PostsRepository;
import com.rinomari.dev.springboot.web.dto.PostsSaveRequestDto;
import com.sun.deploy.security.CertStore;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsApiController postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
