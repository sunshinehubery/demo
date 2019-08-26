package cn.sunshinehubery.service.pojo;

import java.util.Date;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 12:20
 * @Version: 1.0
 **/
public class User {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
