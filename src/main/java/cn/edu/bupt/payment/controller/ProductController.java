package cn.edu.bupt.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ProductController
 * @Author : Zhai Zhibin
 * @Date : 2022/5/24 9:56
 * @Description : 商品接口
 * @Modified_by :
 * @Version : 1.0
 **/
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
