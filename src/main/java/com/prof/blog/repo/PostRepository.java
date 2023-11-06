package com.prof.blog.repo;

import com.prof.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  org.springframework.data.repository.CrudRepository;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {

}
