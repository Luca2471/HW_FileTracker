package com.codeclan.example.FileTracker.repositories;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.projections.EmbededFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbededFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
