package com.prof.blog.controlers;

import com.prof.blog.models.Post;
import com.prof.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class BlogControler {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public  String blogMain(Model model){
       Iterable<Post>posts=postRepository.findAll();

        model.addAttribute("posts",posts);
        return "blog-main";
    }
}
