package com.example.dataserviceplatform.Result;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Result implements Serializable {
    int status;
    String msg;
    Object data;

    public static Result success(int code, String msg, Object o)  {
        return new Result(code, msg, o);
    }
}