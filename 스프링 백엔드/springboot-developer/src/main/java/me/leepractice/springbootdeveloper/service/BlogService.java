package me.leepractice.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leepractice.springbootdeveloper.domain.Article;
import me.leepractice.springbootdeveloper.dto.AddArticleRequest;
import me.leepractice.springbootdeveloper.dto.UpdateArticleRequest;
import me.leepractice.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor // final or @NotNull field's constructor
@Service // register to bean
public class BlogService {

    private final BlogRepository blogRepository;

    //blog content adding method
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return  blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found: " + id));
    }
    public void delete(long id){
        blogRepository.deleteById(id);
    }

    @Transactional //transaction
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(),request.getContent());

        return article;
    }
}
