package com.xian.myrpc1.server;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: lishouxian
 * @Date: 2020/11/25 22:11
 * @Description: RPCRequest
 */
@Data
@Builder
public class RPCRequest implements Serializable {
    // 服务类名，客户端只知道接口名，在服务端中用接口名指向实现类
    private String interfaceName;
    // 方法名
    private String methodName;
    // 参数列表
    private Object[] params;
    // 参数类型
    private Class<?>[] paramsTypes;
}