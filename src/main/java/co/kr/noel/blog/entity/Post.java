package co.kr.noel.blog.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@ToString
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postNo;

    private String postTitle;

    private String postContent;

    private Date postCreateDate;

    @Builder
    public Post(String postTitle, String postContent, Date postCreateDate) {
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postCreateDate = postCreateDate;
    }
}
