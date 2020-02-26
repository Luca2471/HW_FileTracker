package com.codeclan.example.FileTracker.projections;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = Folder.class)
public interface EmbededFolder {

    public String getName();
    public User getUser();
    public List<File> getFile();

}
