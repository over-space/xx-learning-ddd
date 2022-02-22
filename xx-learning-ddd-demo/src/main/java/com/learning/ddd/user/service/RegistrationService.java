package com.learning.ddd.user.service;

import com.learning.ddd.user.Address;
import com.learning.ddd.user.Name;
import com.learning.ddd.user.PhoneNumber;
import com.learning.ddd.user.User;

import javax.xml.bind.ValidationException;

/**
 * @author lifang
 * @since 2022/2/22
 */
public interface RegistrationService {

    User register(String name, String phone, String address) throws ValidationException;

    User register(Name name, PhoneNumber phoneNumber, Address address) throws ValidationException;
}
