package com.blogdemo.model.entities;

import lombok.Data;

@Data
public class Response {
    private Object data;
    private String message;
    private int status;
    public final int SUCCESS = 1;
    public final int ERROR = 2;
    public final int ACCESS_DENIED = 3;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
