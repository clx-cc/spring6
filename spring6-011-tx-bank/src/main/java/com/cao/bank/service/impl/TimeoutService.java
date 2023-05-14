package com.cao.bank.service.impl;

import com.cao.bank.dao.AccountDao;
import com.cao.bank.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ts")
public class TimeoutService {
    @Autowired
    private AccountDao accountDao;
    @Transactional(timeout = 10)
    public void save(Account act){

//        accountDao.insert(act);
        try {
            Thread.sleep(1000 *15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.insert(act);

    }
}
