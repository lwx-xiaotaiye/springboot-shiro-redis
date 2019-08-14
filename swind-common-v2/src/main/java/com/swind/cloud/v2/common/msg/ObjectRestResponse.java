package com.swind.cloud.v2.common.msg;

import com.swind.cloud.v2.common.constant.RestCodeConstants;

public class ObjectRestResponse<T> extends BaseResponse {

    T data;
    boolean rel;

    public boolean isRel() {
        return rel;
    }

    public void setRel(boolean rel) {
        this.rel = rel;
    }


    public ObjectRestResponse rel(boolean rel) {
        this.setRel(rel);
        return this;
    }


    public ObjectRestResponse data(T data) {
        this.setData(data);
        return this;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ObjectRestResponse ok() {
        setStatus(200);
        setMessage(RestCodeConstants.SUCCESS);
        return this;
    }

    public ObjectRestResponse ok(String message) {
        setStatus(200);
        setMessage(message);
        return this;
    }

    public ObjectRestResponse error(int errorCode, String errMessage) {
        setStatus(errorCode);
        setMessage(errMessage);
        return this;
    }
}
