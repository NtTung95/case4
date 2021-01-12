package com.blogdemo.repository;

import com.blogdemo.model.entities.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post,Long> {
    Post findAllByTitle(String title);

    @Query(value = "CALL `demo_blog`.get_all_employee();", nativeQuery = true)
    Iterable<Post> getAllByCategories();
}
