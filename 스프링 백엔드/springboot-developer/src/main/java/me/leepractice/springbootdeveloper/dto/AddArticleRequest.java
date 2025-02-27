package me.leepractice.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.leepractice.springbootdeveloper.domain.Article;

@NoArgsConstructor // base constructor
@AllArgsConstructor // all field constructor
@Getter
public class AddArticleRequest {
    private  String title;
    private String content;

    public Article toEntity(){ // make entity using constructor
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
