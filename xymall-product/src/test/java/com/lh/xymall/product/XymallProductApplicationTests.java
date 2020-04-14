package com.lh.xymall.product;

import com.lh.xymall.product.entity.BrandEntity;
import com.lh.xymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XymallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("华为");

        //brandService.save(brandEntity);

       // brandEntity.setDescript("华为");
        //brandEntity.setBrandId(1L);
       // brandService.updateById(brandEntity);
    }

}
