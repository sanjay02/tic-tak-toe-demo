package san.ibm.demo.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DatabaseConfiguration {
    Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        log.info("DB connection for DEV - H2");
        log.info(driverClassName);
        log.info(url);
        return "DB connection for DEV - H2";
    }

    @Profile("test")
    @Bean
    public String testDatabaseConnection() {
        log.info("DB Connection to RDS_TEST - Low Cost Instance");
        log.info(driverClassName);
        log.info(url);
        return "DB Connection to RDS_TEST - Low Cost Instance";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConnection() {
        log.info("DB Connection to RDS_PROD - High Performance Instance");
        log.info(driverClassName);
        log.info(url);
        return "DB Connection to RDS_PROD - High Performance Instance";
    }
}
