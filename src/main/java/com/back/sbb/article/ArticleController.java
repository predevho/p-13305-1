package com.back.sbb.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ArticleController {

    @GetMapping("/article/list")
    public String list(){
        return "article_list";
    }
}
