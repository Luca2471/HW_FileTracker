package com.codeclan.example.FileTracker.repositories;

import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.projections.EmbededFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbededFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
