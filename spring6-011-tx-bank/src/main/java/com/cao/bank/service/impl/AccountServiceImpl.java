package com.cao.bank.service.impl;

import com.cao.bank.dao.AccountDao;
import com.cao.bank.pojo.Account;
import com.cao.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountServiceImpl")
//@Transactional//放在类上，表示这个类里的所有方法都会进行事务管理
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDaoImpl")
    private AccountDao accountDao;

    @Override
    @Transactional //放在方法上，只会对这个方法进行事务管理
    public void transfer(String fromActno, String toActno, double money) {
        //查询转账账户余额是否大于转账金额
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money){
            throw new RuntimeException("账户余额不足！");
        }
        //走到这，余额肯定是充足的
        //进行转账
        Account toAct = accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        //更新数据
        int count = accountDao.update(fromAct);
        //模拟异常
//        String s = null;
//        s.toString();
        count += accountDao.update(toAct);
        if (count != 2){
            throw new RuntimeException("转账失败");
        }
        withdraw();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void withdraw(){

    }

    @Resource(name = "accountServiceImpl2")
    private AccountService accountService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        //这里调用dao的insert方法
        accountDao.insert(act);
        //创建对象
        Account act2 = new Account(null,"act004",1000.0);
        try {
            accountService.save(act2);
        } catch (Exception e) {

        }

    }
}
