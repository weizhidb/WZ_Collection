package com.example.designPartten.proxyMode;

import com.example.proxyMode.*;
import com.example.proxyMode.XiangQinInterface;
import com.example.proxyMode.ZhangSanXiangQinInterfaceImpl;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 张三来到了婚介所(相亲现场)，开始相亲。  
 *
 * @author zhengt
 * @time Jun 3, 2095 3:17:16 PM  
 */
public class HunJieSuo {
    public static void main(String args[]) {
        //先将张三相亲这个相亲的实现类实例化，也就是得到XiangQinInterface接口的一个实例对象    
        com.example.designPartten.proxyMode.XiangQinInterface zhangSan = new com.example.designPartten.proxyMode.ZhangSanXiangQinInterfaceImpl();
        /**
         * 得到ZhangSanXiangQinInterfaceImpl这个类的一个代理类，同时为代理类绑定了一个处理类ReadyInvocationHandler。
         * 听着很绕口，其实就是每次调用ZhangSanXiangQinInterfaceImpl这个子类的xiangQin方法时，
         * 不是zhangSan这个ZhangSanXiangQinInterfaceImpl类的实例去调用，
         * 而是这个ZhangSanXiangQinInterfaceImpl的代理类ReadyInvocationHandler去调用它自己的invoke方法,
         * 这个invoke方法里呢可以调用zhangSan这个实例的xiangQin方法
         */
        /**
         * 在java种怎样实现动态代理呢
         * 第一步，我们要有一个接口，还要有一个接口的实现类，而这个实现类呢就是我们要代理的对象，
         * 所谓代理呢也就是在调用实现类的方法时，可以在方法执行前后做额外的工作，这个就是代理。
         * 第二步，我们要自己写一个在要代理类的方法执行时，能够做额外工作的类，而这个类必须继承InvocationHandler接口，
         * 为什么要继承它呢？因为代理类的实例在调用实现类的方法的时候，不会调真正的实现类的这个方法，
         * 而是转而调用这个类的invoke方法（继承时必须实现的方法），在这个方法中你可以调用真正的实现类的这个方法。
         * 第三步，在要用代理类的实例去调用实现类的方法的时候，写出下面两段代码。
         */
        Class<?> cls[] = zhangSan.getClass().getInterfaces();
        for(int i  = 0;i < cls.length;i++){

            System.out.println("getInterfaces = " + cls[i].getClass());
        }
        com.example.designPartten.proxyMode.XiangQinInterface proxy = (com.example.designPartten.proxyMode.XiangQinInterface) Proxy.newProxyInstance(
                zhangSan.getClass().getClassLoader(),
                zhangSan.getClass().getInterfaces(),
                new ReadyInvocationHandler(zhangSan));
        proxy.xiangQin();
        proxy.jiehun(1);
        /**
         * 这里要解释下中部那段长长的代码的意思，以及具体做了哪些工作？  
         * 第一，根据zhangSan.getClass().getClassLoader()这个要代理类的类加载器和  
         * zhangSan.getClass().getInterfaces()要代理类所实现的所有的接口  
         * 作为参数调用Proxy.getProxyClass(ClassLoader loader, Class<?>... interfaces)  
         * 的方法返回代理类的java.lang.Class对象，也就是得到了java动态生成的代理类$Proxy0的Class对象。  
         * 同时，java还让这个动态生成的$Proxy0类实现了要代理类的实现的所有接口，并继承了Proxy接口。  
         * 第二，实例化这个动态生成的$Proxy0类的一个实例，实例化代理类的构造函数为Proxy(InvocationHandler h)，  
         * 也就是说要实例化这个动态生成的$Proxy0类，必须给它一个InvocationHandler参数，也就是我们自己实现的用来在代理类  
         * 方法执行前后做额外工作的类ReadyInvocationHandler。  
         * 这段代码Proxy.newProxyInstance(zhangSan.getClass().getClassLoader(),zhangSan.getClass().getInterfaces(),new ReadyInvocationHandler(zhangSan))  
         * 得到的其实是一个类名叫$Proxy0 extends Proxy implements XiangQinInterface的类。  
         * 第三，将这个$Proxy0类强制转型成XiangQinInterface类型，调用xiangQin方法。  
         */
    }
}  