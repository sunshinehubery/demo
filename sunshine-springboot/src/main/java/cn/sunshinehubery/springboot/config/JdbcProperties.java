package cn.sunshinehubery.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/21 10:36
 * @Version: 1.0
 **/
@ConfigurationProperties("jdbc")
public class JdbcProperties {
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
}
