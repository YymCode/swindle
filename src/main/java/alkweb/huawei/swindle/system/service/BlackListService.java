package alkweb.huawei.swindle.system.service;

import alkweb.huawei.swindle.common.service.IService;
import alkweb.huawei.swindle.system.entity.BlackListEntity;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/12
 */
public interface BlackListService extends IService<BlackListEntity> {

    List<BlackListEntity> findAllBlackLis(BlackListEntity entity);


}
