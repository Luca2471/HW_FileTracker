package com.codeclan.example.FileTracker.projections;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbededFile {

    public String getName();
    public String getExtension();
    public int getSize();
    public Folder getFolder();

}
