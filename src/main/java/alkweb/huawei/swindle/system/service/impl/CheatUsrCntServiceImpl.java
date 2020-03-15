package alkweb.huawei.swindle.system.service.impl;

import alkweb.huawei.swindle.common.service.impl.BaseService;
import alkweb.huawei.swindle.system.entity.CheatUsrCntEntity;
import alkweb.huawei.swindle.system.requestQo.MainPageQo;
import alkweb.huawei.swindle.system.service.CheatUsrCntService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
@Service("CheatUsrCntService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class CheatUsrCntServiceImpl extends BaseService<CheatUsrCntEntity> implements CheatUsrCntService {


    @Override
    public List<CheatUsrCntEntity> findAllCheatUsrCnt(MainPageQo data) {
        Example example = new Example(CheatUsrCntEntity.class);

        Criteria criteria = example.createCriteria();

        if( StringUtils.isNotBlank(data.getSearchDate())){
            criteria.andCondition("to_char(update_time,'yyyymmdd') = ",data.getSearchDate());
        }

        if(StringUtils.isNotBlank(data.getWarnLevel())){
            criteria.andCondition("warn_level = ",data.getWarnLevel());
        }

        example.setOrderByClause("cheat_rate desc");
        return this.selectByExample(example);

    }
}
