package com.example.springvue.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@Configuration
public class DatabaseConfig {
    @PersistenceContext
    private EntityManager entityManager;

    /*
    Steps to add data source:
    Created this class, DatabaseConfig.java, which instantiates configuration beans based on the active spring profile
    Created the models package and added a class which could represent our user model (User.java) and a class which could represent our address model (Address.java)
    Created the repace for interacting with address modelsositories package and added a repository interface for interacting with user models and added a repository interf
    Created the UserController and added a couple of functions which serve as REST endpoints and use our repository classes to pull data from the mysql database
     */

    // These spring beans will be instantiated when the spring.profiles.active is set to prd
    //TO UNDERSTAND PROFILES, CHECK APPLICATION.PROPERTIES.
    @Bean
    @Primary
    @Profile("prd")
    public DataSource productionDataSource() throws IOException {
        executeSqlScript();
        return this.productionDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean
    @Primary
    @Profile("prd")
    @ConfigurationProperties("spring.datasource.prd")
    public DataSourceProperties productionDataSourceProperties() {
        return new DataSourceProperties();
    }

    // These spring beans will be instantiated when the spring.profiles.active is set to tst (running a local data source for now)
    @Bean
    @Profile("prd")
    public DataSource localDataSource() throws IOException {
        executeSqlScript();
        return this.localDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean
    @Profile("local")
    @ConfigurationProperties("spring.datasource.local")
    public DataSourceProperties localDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Transactional
    public void executeSqlScript() throws IOException {
        String sqlScriptPath = "src/main/resources/data.sql";
        Path path = Paths.get(sqlScriptPath);
        String sqlScript = Files.lines(path).collect(Collectors.joining("\n"));

        entityManager.createNativeQuery(sqlScript).executeUpdate();
    }
}