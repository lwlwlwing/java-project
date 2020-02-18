package com.imooc.sell.service;

import com.imooc.sell.error.BusinessException;
import com.imooc.sell.service.model.UserModel;

/**
 * @author Jeremy
 * @date 2020/2/3 16:14
 */
public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
