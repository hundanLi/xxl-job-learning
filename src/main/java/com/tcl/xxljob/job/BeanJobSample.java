package com.tcl.xxljob.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 *
 * Bean模式任务开发示例
 * 1.方法签名格式：
 *  public ReturnT<String>  methodName(String param) {}
 * 2.添加注解：@XxlJob(value="jobHandler名称，与调度中心的任务管理JobHandler属性对应")
 * 3.执行日志：需要通过 "XxlJobLogger.log" 打印执行日志；
 * @author hundanli
 * @version 1.0.0
 * @date 2020/9/15 19:07
 */
@Component
public class BeanJobSample {

    @XxlJob(value = "helloJob")
    public ReturnT<String> helloJob(String param) {
        System.out.println("hello job: " + param);
        XxlJobLogger.log("hello job执行日志");
        return ReturnT.SUCCESS;
    }

}
