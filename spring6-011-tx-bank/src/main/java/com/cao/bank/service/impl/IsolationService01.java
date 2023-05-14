package com.cao.bank.service.impl;

import com.cao.bank.dao.AccountDao;
import com.cao.bank.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service("is01")
public class IsolationService01 {

    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void getByActno(String actno){
        Account account = accountDao.selectByActno(actno);
        System.out.println(account);
    }

}
