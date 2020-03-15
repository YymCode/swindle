package alkweb.huawei.swindle.system.service;

import alkweb.huawei.swindle.common.service.IService;
import alkweb.huawei.swindle.system.entity.SysLogEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/13
 */
public interface SysLogService extends IService<SysLogEntity> {

    @Async
    void saveLog(ProceedingJoinPoint point, SysLogEntity log) throws JsonProcessingException;

}
