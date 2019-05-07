package co.kr.noel.blog.service;

import co.kr.noel.blog.entity.Post;

import java.util.List;

public interface PostService {

    void createPost(Post post);

    Post getPost(long postNo);

    void deletePost(long postNo);

    List<Post> getPostList();
}
