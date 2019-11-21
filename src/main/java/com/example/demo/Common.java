package com.example.demo;

import lombok.Data;

/**
 * Created by 张齐 on 2019/11/21.
 */
@Data
public class Common {
    private int code;
    private  String message;
    private  Object data;

    public Common() {
    }

    public Common(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
