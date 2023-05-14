package com.cao.bank.service.impl;

import com.cao.bank.dao.AccountDao;
import com.cao.bank.pojo.Account;
import com.cao.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountServiceImpl2")
public class AccountServiceImpl2 implements AccountService {

    @Resource(name = "accountDaoImpl")
    private AccountDao accountDao;
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        accountDao.insert(act);
        //模拟异常
//        String s = null;
//        s.toString();
        //后续可能还有其他的DML语句

    }
}
