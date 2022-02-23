package com.likamao.simpletool.service;

/**
 * <p>
 * 自定义 REST 请求 
 * 
 * 如果调用频繁 可构建工具类 并用拦截器作 不同场合的设置请求头和请求体
 * </p>
 * 
 * @author: huanghao
 * @since: 2022-02-23, 10:24:44
*/
public interface CustomREST {

    /**
     * get 请求
     * 
     * @param geturl
     * @param params
     * @return
     */
    public String doGet(String geturl, String params);

    /**
     * post 请求
     * 
     * @param geturl
     * @param params
     * @return
     */
    public String doPost(String geturl, String params);
}
