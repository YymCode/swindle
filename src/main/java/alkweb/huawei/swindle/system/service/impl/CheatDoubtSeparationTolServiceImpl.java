package alkweb.huawei.swindle.system.service.impl;

import alkweb.huawei.swindle.common.service.impl.BaseService;
import alkweb.huawei.swindle.system.entity.CheatDoubtSeparationTolEntity;
import alkweb.huawei.swindle.system.requestQo.MainPageQo;
import alkweb.huawei.swindle.system.service.CheatDoubtSeparationTolService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
@Service("CheatDoubtSeparationTolService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class CheatDoubtSeparationTolServiceImpl extends BaseService<CheatDoubtSeparationTolEntity> implements CheatDoubtSeparationTolService {


    @Override
    public List<CheatDoubtSeparationTolEntity> findAllCheatDoubtSeparationTol(MainPageQo data) {
        Example example = new Example(CheatDoubtSeparationTolEntity.class);
        Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(data.getSearchDate())){
            criteria.andCondition("to_char(update_time,'yyyymmdd') = ",data.getSearchDate());
        }
        example.setOrderByClause("cheat_rate desc");
        return this.selectByExample(example);
    }
}
