package com.springmvc.service.impl;

import com.springmvc.bean.Users;
import com.springmvc.bean.UsersExample;
import com.springmvc.bean.UsersExample.Criteria;
import com.springmvc.mapper.UsersMapper;
import com.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users login(Users users) throws Exception{
        UsersExample usersExample=new UsersExample();
        Criteria criteria=usersExample.createCriteria();
        criteria.andUsernameEqualTo(users.getUsername());
        criteria.andPasswordEqualTo(users.getPassword());
        Users users1=new Users();
        try{
            users1=usersMapper.selectByExample(usersExample).get(0);
        }catch (Exception e){
            e.printStackTrace();
        }
        return users1;
    }
    public boolean checkUser(String username){
        UsersExample example=new UsersExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        long count = usersMapper.countByExample(example);
        System.out.println("count:"+count);
        return count==0;
    }
    public List<Users> checkUser1(String username){
        UsersExample example=new UsersExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        return usersMapper.selectByExample(example);
    }

    @Override
    public int addUser(Users users) {
        return usersMapper.insertSelective(users);
    }

    @Override
    public List<Users> getAll() {
        return usersMapper.selectByExample(null);
    }

    @Override
    public Users getUser(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }
    @Override
    public int changeUser(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public List<Users> getAllSelect(int id) {
        UsersExample example=new UsersExample();
        Criteria criteria = example.createCriteria();
        criteria.andIdLessThanOrEqualTo(id);
        return usersMapper.selectByExample(example);
    }

    @Override
    public int deleteUser(int id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int modUserstau(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users);
    }
}
