package com.learning.ddd.user;

import javax.xml.bind.ValidationException;

/**
 * @author lifang
 * @since 2022/2/22
 */
public class Address {

    public final String address;

    public Address(String address) throws ValidationException {
        if (address == null || address.length() == 0) {
            throw new ValidationException("address");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
