package tech.bongers.dicobo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
// @EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class DatabaseConfiguration {

    /*@Bean
    AuditorAware<String> auditorProvider() {
        return new SecurityAuditorAware();
    }*/

    @Bean
    public DataSource dataSource() {
        final var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("sa");
        return dataSource;
    }
}
