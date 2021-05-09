package org.apache.dubbo.common.spi;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author wangdan
 * @date 2021/4/19
 */
public class JdkSpiDemo {

    @Test
    public void testJdkSpi(){
        ServiceLoader<HelloService> helloServices = ServiceLoader.load(HelloService.class);
        Iterator<HelloService> iterator =  helloServices.iterator();
        String param = "lili";
        while (iterator.hasNext()){
            HelloService helloService = iterator.next();
            System.out.println(helloService.sayHello(param));
        }
    }
}
