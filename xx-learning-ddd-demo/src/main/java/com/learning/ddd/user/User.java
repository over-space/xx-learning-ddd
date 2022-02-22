package com.learning.ddd.user;

import java.io.Serializable;

/**
 * @author lifang
 * @since 2022/2/22
 */
public class User implements Serializable {

    private Long id;

    private String name;

    private String phone;

    private String address;

    private Long repId;

    public User() {
    }

    public User(String name, String phone, String address, Long repId) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.repId = repId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getRepId() {
        return repId;
    }

    public void setRepId(Long repId) {
        this.repId = repId;
    }
}
