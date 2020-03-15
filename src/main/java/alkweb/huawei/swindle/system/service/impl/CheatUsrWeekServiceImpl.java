package alkweb.huawei.swindle.system.service.impl;

import alkweb.huawei.swindle.common.service.impl.BaseService;
import alkweb.huawei.swindle.common.util.DateUtils;
import alkweb.huawei.swindle.system.entity.CheatUsrWeekEntity;
import alkweb.huawei.swindle.system.requestQo.MainPageQo;
import alkweb.huawei.swindle.system.service.CheatUsrWeekService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
@Service("CheatUsrWeekService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class CheatUsrWeekServiceImpl extends BaseService<CheatUsrWeekEntity> implements CheatUsrWeekService {
    @Override
    public List<CheatUsrWeekEntity> findAllCheatUsrWeek(MainPageQo data) {
        String monday = DateUtils.getWeekMonday(data.getSearchDate());
        String sunday = DateUtils.getWeekSunday(data.getSearchDate());
        Example example = new Example(CheatUsrWeekEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andCondition("to_char(update_time,'yyyymmdd') >=", monday);
        criteria.andCondition("to_char(update_time,'yyyymmdd') <=", sunday);
        example.setOrderByClause("week asc");
        List<CheatUsrWeekEntity> cheatUsrWeeklist = this.selectByExample(example);
        List<CheatUsrWeekEntity> list = new ArrayList<>();
        String[] weeks = {"A_周一","A_周二","A_周三","A_周四","A_周五","A_周六","A_周日"};
        for(int i=0;i<7;i++) {
            String week1 = weeks[i];
            boolean flag = false;
            for(CheatUsrWeekEntity c:cheatUsrWeeklist) {
                String week2 = c.getWeek();
                if(week1.equals(week2)) {
                    flag = true;
                    list.add(c);
                }
            }
            if(!flag) {
                CheatUsrWeekEntity c = new CheatUsrWeekEntity();
                c.setWeek(week1);
                list.add(c);
            }
        }
        return list;
    }
}
