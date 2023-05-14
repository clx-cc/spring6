package com.cao.spring6.service;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {//目标对象

    //转账的业务方法
    public void transfer(){//目标方法
        System.out.println("正在转账");
    }

    //取款的业务方法
    public void withdraw(){//目标方法
        System.out.println("正在取款");
    }
}
