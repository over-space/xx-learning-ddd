package com.learning.ddd.user.repository;

import com.learning.ddd.user.Sale;
import org.springframework.stereotype.Repository;

/**
 * @author lifang
 * @since 2022/2/22
 */
@Repository
public class SaleRepository {

    public Sale findByAreaCode(String areaCode){
        Sale sale = new Sale();
        sale.setId(1000L);
        return sale;
    }
}
