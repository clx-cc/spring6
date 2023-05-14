package com.cao.proxy.client;

import com.cao.proxy.service.OrderService;
import com.cao.proxy.service.TimerInvocationHandler;
import com.cao.proxy.service.impl.OrderServiceImpl;

import java.lang.reflect.Proxy;

public class Client {
    //客户端程序
    public static void main(String[] args) {
        //创建目标对象
        OrderService target = new OrderServiceImpl();

        /*
            1.newProxyInstance：新建代理对象
                也就是说，调用这个方法可以新建代理对象。
                实际上，Proxy.newProxyInstance()方法的执行，做了两件事：
                    第一：在内存中动态生成了代理类的字节码文件（.class）。和我们自己写的代理类一样，只是我们的代理类生成的字节码文件在硬盘中，而这个在内存中。
                    第二：new对象了，  通过代理类的字节码文件实例化了代理对象
            2.关于newProxyInstance()方法的三个参数：
                第一个参数：ClassLoader loader
                    类加载器，在内存中生成的字节码也是.class文件，要执行这个文件需要先加载到内存中。
                    加载类就需要类加载器，所以这里需要指定类加载器，并且JDK要求：代理类的类加载器要和目标类的类加载器使用同一个。
                第二个参数：Class<?>[] interfaces
                    代理类和目标类要实现同一个接口或者一些接口
                    在内存中生成代理类，这个代理类需要实现哪些接口是需要我们告诉他的。
                第三个参数：InvocationHandler h
                    调用处理器，是一个接口
                    既然是一个接口，我们就需要实现这个接口，并重写其中的方法。
                    也就是说我们的增强代码写到这儿
            注意：
                代理对象和目标对象实现的接口一样，所以可以向下转型。


         */
        //创建代理对象
        OrderService proxy = (OrderService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                target.getClass().getInterfaces(),
                                                    new TimerInvocationHandler(target));
        //代理对象调用代理方法
            //注意：调用代理对象的代理方法时，如果你需要扩展的话，目标对象的目标方法得保证执行。
        System.out.println(proxy.getName());
        proxy.general();
        proxy.modify();
        proxy.detail();
    }
}
