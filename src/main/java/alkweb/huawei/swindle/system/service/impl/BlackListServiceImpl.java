package alkweb.huawei.swindle.system.service.impl;

import alkweb.huawei.swindle.common.service.impl.BaseService;
import alkweb.huawei.swindle.system.entity.BlackListEntity;
import alkweb.huawei.swindle.system.service.BlackListService;
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
 * @Date: 2020/3/12
 */
@Service("BlackListService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class BlackListServiceImpl extends BaseService<BlackListEntity> implements BlackListService {
    @Override
    public List<BlackListEntity> findAllBlackLis(BlackListEntity entity) {
        Example example = new Example(BlackListEntity.class);
        Criteria criteria = example.createCriteria();
        if(!(entity.getAreaId()== null)){
            criteria.andCondition("AREA_ID=", entity.getAreaId());
        }
        return this.selectByExample(example);
    }
}
