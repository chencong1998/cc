package com.springmvc.service.impl;

import com.springmvc.bean.Balance;
import com.springmvc.bean.BalanceExample;
import com.springmvc.mapper.BalanceMapper;
import com.springmvc.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private BalanceMapper balanceMapper;

    //查询所有收付款
    @Override
    public int balanceAll() {
        return balanceMapper.countByExample(null);
    }

    //分页查询
    /*@Override
    public List<Balance> balancePage(int currPage, int limit) {
        BalanceExample balanceExample = new BalanceExample();
        //设置当前查询位置
        balanceExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        balanceExample.setLimit(limit);

        BalanceExample.Criteria criteria = balanceExample.createCriteria();
        List<Balance> list=balanceMapper.selectByExample(balanceExample);
        return list;
    }*/

    //查看单个信息
    @Override
    public Balance balanceById(int id) {
        return balanceMapper.selectByPrimaryKey(id);
    }

    //删除收付款信息
    @Override
    public int balanceDeleteId(int id) {
        return balanceMapper.deleteByPrimaryKey(id);
    }

    //添加收付款
    @Override
    public int balanceAdd(Balance balance) {
        return balanceMapper.insertSelective(balance);
    }

    //修改收付款
    @Override
    public int balanceUpdate(Balance balance) {
        return balanceMapper.updateByPrimaryKey(balance);
    }

    /*//查看客户收付款
    @Override
    public List<Balance> balanceByCus(int customerId,int currPage, int limit) {
        BalanceExample balanceExample = new BalanceExample();
        BalanceExample.Criteria criteria = balanceExample.createCriteria();
        //设置当前查询位置
        balanceExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        balanceExample.setLimit(limit);
        criteria.andCustomeridEqualTo(customerId);
        List<Balance> list=balanceMapper.selectByExample(balanceExample);
        return list;
    }*/

    //查看客户所有收付款
    @Override
    public int balanceByCus(int customerId) {
        BalanceExample balanceExample = new BalanceExample();
        BalanceExample.Criteria criteria = balanceExample.createCriteria();
        criteria.andCustomeridEqualTo(customerId);
        return balanceMapper.countByExample(balanceExample);
    }

    /*//客户往来查询分页
    @Override
    public List<Balance> balanceModify(Balance balance,List<Integer> listTransId,int currPage, int limit) {
        BalanceExample balanceExample = new BalanceExample();
        BalanceExample.Criteria criteria = balanceExample.createCriteria();
        //设置当前查询位置
        balanceExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        balanceExample.setLimit(limit);

        //客户Id查询
        if (listTransId.size()>0)
            criteria.andCustomeridIn(listTransId);

        //收付款类别
        if (balance.getPaidtype()!=""&&balance.getPaidtype()!=null)
            criteria.andPaidtypeEqualTo(balance.getPaidtype());

        //状态
        if (balance.getIsvalid()!=""&&balance.getIsvalid()!=null)
            criteria.andIsvalidEqualTo(balance.getIsvalid());

        //付款起始时间
        if (balance.getPaidtime()!=null)
            criteria.andPaidtimeGreaterThanOrEqualTo(balance.getPaidtime()); // 大于等于

        //付款结束时间
        if (balance.getOprtime()!=null)
            criteria.andOprtimeLessThanOrEqualTo(balance.getOprtime()); //小于等于

        List<Balance> list=balanceMapper.selectByExample(balanceExample);
        return list;
    }*/

    //客户往来查询所有
    @Override
    public int balanceModify(Balance balance,List<Integer> listTransId) {
        BalanceExample balanceExample = new BalanceExample();
        BalanceExample.Criteria criteria = balanceExample.createCriteria();

        //客户Id查询
        if (listTransId.size()>0)
            criteria.andCustomeridIn(listTransId);

        //收付款类别
        if (balance.getPaidtype()!=""&&balance.getPaidtype()!=null)
            criteria.andPaidtypeEqualTo(balance.getPaidtype());

        //状态
        if (balance.getIsvalid()!=""&&balance.getIsvalid()!=null)
            criteria.andIsvalidEqualTo(balance.getIsvalid());

        //付款起始时间
        if (balance.getPaidtime()!=null)
            criteria.andPaidtimeGreaterThanOrEqualTo(balance.getPaidtime()); // 大于等于

        //付款结束时间
        if (balance.getOprtime()!=null)
            criteria.andOprtimeLessThanOrEqualTo(balance.getOprtime()); //小于等于
        return balanceMapper.countByExample(balanceExample);
    }


}
