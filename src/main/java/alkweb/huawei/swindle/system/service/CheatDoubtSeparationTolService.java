package alkweb.huawei.swindle.system.service;

import alkweb.huawei.swindle.common.service.IService;
import alkweb.huawei.swindle.system.entity.CheatDoubtSeparationTolEntity;
import alkweb.huawei.swindle.system.requestQo.MainPageQo;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
public interface CheatDoubtSeparationTolService extends IService<CheatDoubtSeparationTolEntity> {

    List<CheatDoubtSeparationTolEntity> findAllCheatDoubtSeparationTol(MainPageQo data);
}
