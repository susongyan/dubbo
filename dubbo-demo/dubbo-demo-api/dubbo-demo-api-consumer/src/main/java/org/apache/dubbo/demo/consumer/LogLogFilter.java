package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

import java.awt.*;

public class LogLogFilter implements Filter{

    public LogLogFilter() {
        System.out.println("loglog filter inited");
    }

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("\u001B[31m hello loglog... \u001B[0m");
        return invoker.invoke(invocation);
    }
}
