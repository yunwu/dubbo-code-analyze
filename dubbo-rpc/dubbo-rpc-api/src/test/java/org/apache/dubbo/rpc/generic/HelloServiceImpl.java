package org.apache.dubbo.rpc.generic;

/**
 * @author wangdan
 * @date 2021/4/16
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello world!";
    }
}
