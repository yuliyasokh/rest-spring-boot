package com.springboot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private String status;
    private int code;

    public BaseResponse(String status, int code) {
        this.status = status;
        this.code = code;
    }
}
