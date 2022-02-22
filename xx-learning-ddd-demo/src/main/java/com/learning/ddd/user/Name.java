package com.learning.ddd.user;

import javax.xml.bind.ValidationException;

/**
 * @author lifang
 * @since 2022/2/22
 */
public class Name {

    private final String name;

    public Name(String name) throws ValidationException {
        if (name == null || name.length() == 0) {
            throw new ValidationException("name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
