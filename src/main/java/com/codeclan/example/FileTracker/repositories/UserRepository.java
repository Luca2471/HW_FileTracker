package com.codeclan.example.FileTracker.repositories;

import com.codeclan.example.FileTracker.models.User;
import com.codeclan.example.FileTracker.projections.EmbededUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbededUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
