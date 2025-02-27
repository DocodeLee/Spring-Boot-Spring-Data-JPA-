package me.leepractice.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본 1씩증가
    @Column(name ="id", updatable = false)
    private long id;

    @Column(name = "title", nullable = false) // title not null
    private String title;

    @Column(name= "content", nullable = false)
    private String content;

    @Builder // builder pattern makes object
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

    public void  update(String title, String content){
        this.title = title;
        this.content = content;
    }

    @CreatedDate // save entity created time
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate // save entity modified time
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
