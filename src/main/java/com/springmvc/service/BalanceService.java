package com.springmvc.service;

import com.springmvc.bean.Balance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 收付款业务接口
 */
@Service
@Transactional
public interface BalanceService {

    //查询所有收付款
    public int balanceAll();

    /*//分页查询
    public List<Balance> balancePage(int currPage, int limit);*/

    //查询信息
    public Balance balanceById(int id);

    //删除收付款
    public int balanceDeleteId(int id);

    //添加收付款
    public int balanceAdd(Balance balance);

    //修改收付款
    public int balanceUpdate(Balance balance);

   /* //查看客户收付款
    public List<Balance> balanceByCus(int customerId, int currPage, int limit);*/

    //查看客户所有收付款
    public int balanceByCus(int customerId);

    /*//客户往来查询分页
    public List<Balance> balanceModify(Balance balance, List<Integer> listTransId, int currPage, int limit);*/

    //客户往来查询所有
    public int balanceModify(Balance balance, List<Integer> listTransId);
}

