package com.cao.bank.dao;

import com.cao.bank.pojo.Account;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public interface AccountDao {

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
}
