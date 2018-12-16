package com.model;


import com.constant.PublicResultConstant;

/**
 * @author maxl
 * @time 2018-12-16
 */
public class PublicResult<T> extends BaseResult<T> {

    public static final String DEFAULT_CODE = "90000003";
    public PublicResult(PublicResultConstant publicResultConstant, T data) {
        super(publicResultConstant.getResult(), publicResultConstant.getMsg(), data);
    }
    public PublicResult(String message, T data) {
        super(DEFAULT_CODE, message, data);
    }
}
