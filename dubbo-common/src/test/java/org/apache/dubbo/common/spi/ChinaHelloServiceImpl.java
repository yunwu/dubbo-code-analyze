package org.apache.dubbo.common.spi;

/**
 * @author wangdan
 * @date 2021/4/19
 */
public class ChinaHelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String param) {
        return "你好，" + param;
    }
}
