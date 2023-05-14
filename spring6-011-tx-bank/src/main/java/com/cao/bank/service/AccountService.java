package com.cao.bank.service;

import com.cao.bank.pojo.Account;
import org.springframework.stereotype.Service;

@Service("accountService")
public interface AccountService {

    /**
     * 转账
     * @param fromActno
     * @param toActno
     * @param money
     */
    void transfer(String fromActno, String toActno, double money);
    void save(Account act);
}
