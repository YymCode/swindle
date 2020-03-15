package alkweb.huawei.swindle.system.controller;

import alkweb.huawei.swindle.common.annotaion.Log;
import alkweb.huawei.swindle.common.controller.BaseController;
import alkweb.huawei.swindle.common.domain.QueryRequest;
import alkweb.huawei.swindle.system.entity.BlackListEntity;
import alkweb.huawei.swindle.system.service.BlackListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/12
 */
@Controller
public class TestController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BlackListService blackListService;

    @Log("测试任务")
    @RequestMapping("test")
    @ResponseBody
    public Map<String, Object> jobLogList(QueryRequest request, BlackListEntity entity) {
        return super.selectByPageNumSize(request, () -> this.blackListService.findAllBlackLis(entity));
    }


}
