package com.learning.ddd.user.service;

import com.learning.ddd.user.Address;
import com.learning.ddd.user.Name;
import com.learning.ddd.user.PhoneNumber;
import com.learning.ddd.user.Sale;
import com.learning.ddd.user.User;
import com.learning.ddd.user.repository.SaleRepository;
import com.learning.ddd.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.ValidationException;
import java.util.Arrays;

/**
 * @author lifang
 * @since 2022/2/22
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private SaleRepository saleRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public User register(String name, String phone, String address) throws ValidationException {

        // 校验逻辑
        if (name == null || name.length() == 0) {
            throw new ValidationException("name");
        }
        if (phone == null || !isValidPhoneNumber(phone)) {
            throw new ValidationException("phone");
        }

        // 此处省略 address 的校验逻辑


        // 取电话号里的区号，然后通过区号找到区域内的 SalesRep
        String areaCode = null;
        String[] areas = new String[]{"0571", "021", "010"};
        for (int i = 0; i < phone.length(); i++) {
            String prefix = phone.substring(0, i);
            if (Arrays.asList(areas).contains(prefix)) {
                areaCode = prefix;
                break;
            }
        }

        Sale rep = saleRepository.findByAreaCode(areaCode);
        // 最后创建用户，落盘，然后返回
        User user = new User();
        user.setName(name);
        user.setName(phone);
        user.setName(address);
        if (rep != null) {
            user.setRepId(rep.getId());
        }
        return userRepository.save(user);
    }

    @Override
    public User register(Name name, PhoneNumber phoneNumber, Address address) throws ValidationException {
        String userName = name.getName();
        String phone = phoneNumber.getPhone();
        String userAddress = address.getAddress();

        Sale rep = saleRepository.findByAreaCode(phoneNumber.getAreaCode());

        // 最后创建用户，落盘，然后返回
        User user = new User(userName, phone, userAddress, rep.getId());
        return userRepository.save(user);
    }

    private boolean isValidPhoneNumber(String phone) {
        String pattern = "^0[1-9]{2,3}-?\\d{8}$";
        return phone.matches(pattern);
    }
}
