package com.codeclan.example.filesservice.components;

import com.codeclan.example.filesservice.models.File;
import com.codeclan.example.filesservice.models.Folder;
import com.codeclan.example.filesservice.models.User;
import com.codeclan.example.filesservice.repositories.FileRepository;
import com.codeclan.example.filesservice.repositories.FolderRepository;
import com.codeclan.example.filesservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User user = new User("Lisensiado");
        userRepository.save(user);

        Folder folder1 = new Folder("Folder1", user);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Folder2", user);
        folderRepository.save(folder2);

        File file1 = new File("file1", "cpr", 300, folder1);
        fileRepository.save(file1);

        File file2 = new File("file2", "wav", 400, folder1);
        fileRepository.save(file1);

        File file3 = new File("file3", "mp3", 500, folder2);
        fileRepository.save(file1);
    }


}
