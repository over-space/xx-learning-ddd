package com.learning.ddd.user;

import javax.xml.bind.ValidationException;
import java.util.Arrays;

/**
 * @author lifang
 * @since 2022/2/22
 */
public class PhoneNumber {

    private final String phone;

    public PhoneNumber(String phone) throws ValidationException {
        if (phone == null) {
            throw new ValidationException("number 不能为空");
        } else if (isValidPhoneNumber(phone)) {
            throw new ValidationException("number 格式错误");
        }
        this.phone = phone;
    }

    public String getAreaCode() throws ValidationException {
        for (int i = 0; i < phone.length(); i++) {
            String prefix = phone.substring(0, i);
            if (isAreaCode(prefix)) {
                return prefix;
            }
        }
        throw new ValidationException("number 不支持的区域");
    }

    private boolean isValidPhoneNumber(String phone) {
        String pattern = "^0[1-9]{2,3}-?\\d{8}$";
        return phone.matches(pattern);
    }

    private static boolean isAreaCode(String prefix) {
        String[] areas = new String[]{"0571", "021", "010"};
        return Arrays.asList(areas).contains(prefix);
    }


    public String getPhone() {
        return phone;
    }
}
