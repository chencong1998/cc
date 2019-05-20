package com.springmvc.service;

import com.springmvc.bean.Users;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface UsersService {
    public Users login(Users users) throws Exception;
    public boolean checkUser(String username);
    public List<Users> checkUser1(String username);
    public int addUser(Users users);
    public List<Users> getAll();
    public List<Users> getAllSelect(int id);
    public Users getUser(int id);
    public int changeUser(Users users);
    public int deleteUser(int id);
    public int modUserstau(Users users);
}
