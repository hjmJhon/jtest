package io.github.hjmjhon.goods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: TODO
 * author: hjmjhon
 * date: 2021/3/3
 */
@RestController
@RequestMapping("api")
public class GoodsController {

    @GetMapping(value = "detail")
    public String detail() {
        return "detail";
    }
}
