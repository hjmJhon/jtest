package io.github.hjmjhon.goods;

import org.springframework.stereotype.Service;

/**
 * description: TODO
 * author: hjmjhon
 * date: 2021/3/3
 */
@Service
public class GoodsService {

    public String detail(String data) {
        return build(data);
    }

    private String build(String data) {
        return "private method be called";
    }

}
