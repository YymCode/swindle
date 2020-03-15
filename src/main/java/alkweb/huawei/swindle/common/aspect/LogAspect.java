package alkweb.huawei.swindle.common.aspect;

import alkweb.huawei.swindle.SwindleApplication;
import alkweb.huawei.swindle.common.config.SwindleProperties;
import alkweb.huawei.swindle.common.util.HttpContextUtils;
import alkweb.huawei.swindle.common.util.SnowFlake;
import alkweb.huawei.swindle.system.entity.SysLogEntity;
import alkweb.huawei.swindle.system.service.SysLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * AOP 记录用户操作日志
 *
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/13
 */
@Aspect
@Component
public class LogAspect {

    @Autowired
    private SwindleProperties swindle;

    @Autowired
    private SysLogService sysLogService;

    private SnowFlake snowFlake=new SnowFlake(2,3);

    @Pointcut("@annotation(alkweb.huawei.swindle.common.annotaion.Log)")
    public void pointcut() {
        // do nothing
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        Object result = null;
        long beginTime = System.currentTimeMillis();
        // 执行方法
        result = point.proceed();
        // 获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        if(swindle.isOpenAopLog()){
            SysLogEntity log = new SysLogEntity();
            log.setId(snowFlake.nextId());
            log.setUserName("测试用户");
            log.setOperationTime(time);
            sysLogService.saveLog(point, log);
        }
        return result;
    }





}
