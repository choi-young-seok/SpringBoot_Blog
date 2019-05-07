package co.kr.noel.blog.service;

import co.kr.noel.blog.entity.Post;
import co.kr.noel.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final
    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public Post getPost(long postNo) {
//        return postRepository.findById(postNo);
        return postRepository.getOne(postNo);
    }

    @Override
    public void deletePost(long postNo) {
        postRepository.deleteById(postNo);
    }

    @Override
    public List<Post> getPostList() {
        return postRepository.findAll();
    }
}
