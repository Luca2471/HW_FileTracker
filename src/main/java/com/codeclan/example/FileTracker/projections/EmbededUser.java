package com.codeclan.example.FileTracker.projections;

import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbededUser {

    public String getName();
    public List<Folder> getFolder();

}
