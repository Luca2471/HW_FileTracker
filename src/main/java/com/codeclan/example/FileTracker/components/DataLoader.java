package com.codeclan.example.FileTracker.components;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.models.User;
import com.codeclan.example.FileTracker.repositories.FileRepository;
import com.codeclan.example.FileTracker.repositories.FolderRepository;
import com.codeclan.example.FileTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User luca = new User("Luca");
        userRepository.save(luca);

        Folder games = new Folder("Games", luca);
        folderRepository.save(games);

        Folder work = new Folder("Work", luca);
        folderRepository.save(work);

        File gta = new File("GTA", ".txt", 30, games);
        fileRepository.save(gta);

        File forza = new File("Forza", "rb", 100, games);
        fileRepository.save(forza);

    }

}
