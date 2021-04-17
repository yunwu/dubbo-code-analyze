package org.apache.dubbo.rpc.generic;

import org.junit.Test;

/**
 * @author wangdan
 * @date 2021/4/16
 */
public class GenericServiceTest {

    private final HelloService helloService = new HelloServiceImpl();
    private final JDKProxy jdkProxy = new JDKProxy(helloService);

    Class[] interfaces = new Class[]{HelloService.class, GenericService.class};

    @Test
    public void testGeneric(){
        GenericService genericService = (GenericService) jdkProxy.getProxy(interfaces);
        System.out.println(genericService.$sayHello());
    }
}
