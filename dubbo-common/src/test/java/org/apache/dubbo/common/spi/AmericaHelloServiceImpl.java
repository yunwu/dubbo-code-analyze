package org.apache.dubbo.common.spi;

/**
 * @author wangdan
 * @date 2021/4/19
 */
public class AmericaHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String param) {
        return "hello," + param;
    }
}
