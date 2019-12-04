package com.codeclan.example.filesservice;

import com.codeclan.example.filesservice.models.User;
import com.codeclan.example.filesservice.repositories.FileRepository;
import com.codeclan.example.filesservice.repositories.FolderRepository;
import com.codeclan.example.filesservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddUser() {
		User user = new User("Lisensiado");
		userRepository.save(user);
	}
}
