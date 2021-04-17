package org.apache.dubbo.rpc;

import org.apache.dubbo.common.Constants;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @author wangdan
 * @date 2021/4/16
 */
public class QuestionTest {

    public static final Pattern COMMA_SPLIT_PATTERN = Pattern
            .compile("\\s*[,]+\\s*");

    @Test
    public void testPattern(){
        String[] types = COMMA_SPLIT_PATTERN.split("api/interface1, api/interface2");
        System.out.println(types);
    }
}
