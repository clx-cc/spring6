package com.cao.bank.service.impl;

import com.cao.bank.dao.AccountDao;
import com.cao.bank.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service("is02")
public class IsolationService02 {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void save(Account act){

        try {
            accountDao.insert(act);
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
