package com.yankarto.mongodb.springbootmongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.yankarto.mongodb.springbootmongodb.document.Users;
import com.yankarto.mongodb.springbootmongodb.repository.UsersRepository;


@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return strings -> {
            usersRepository.save(new Users(1, "yan", "Development", "developer", 3000L));
            usersRepository.save(new Users(2, "karto", "Operations", "tester", 2000L));
        };
	
}
}
