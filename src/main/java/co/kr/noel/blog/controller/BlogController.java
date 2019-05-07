package co.kr.noel.blog.controller;

import co.kr.noel.blog.entity.Post;
import co.kr.noel.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    final
    PostService postService;

    public BlogController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/")
    public String index(){
        return "hello SpringBoot";
    }

    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){
        postService.createPost(post);
    }

    @GetMapping(value = "/post/{postNo}")
    public ResponseEntity<Post> getPost(@PathVariable(name = "postNo") long postNo){
        return new ResponseEntity<>(postService.getPost(postNo), HttpStatus.OK);
    }

    @GetMapping(value = "/post")
    public ResponseEntity<List<Post>> getPostList(){
        return new ResponseEntity<List<Post>>(postService.getPostList(), HttpStatus.OK);
    }
}
