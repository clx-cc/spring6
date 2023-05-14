package com.cao.bank.mapper;

import com.cao.bank.pojo.Account;

import java.util.List;

public interface AccountMapper {

    /**
     * 查询所有
     * @return
     */
    List<Account> selectAll();
    /**
     * 根据账户查询余额
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新账户
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 插入账户
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 根据账号删除数据
     * @param actno
     * @return
     */
    int deleteByActno(String actno);
}
