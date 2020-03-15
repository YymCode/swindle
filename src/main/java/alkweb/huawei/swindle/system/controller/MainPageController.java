package alkweb.huawei.swindle.system.controller;

import alkweb.huawei.swindle.common.controller.BaseController;
import alkweb.huawei.swindle.common.domain.QueryRequest;
import alkweb.huawei.swindle.common.domain.ResponseBo;
import alkweb.huawei.swindle.system.entity.CheatUsrWeekEntity;
import alkweb.huawei.swindle.system.requestQo.MainPageQo;
import alkweb.huawei.swindle.system.service.CheatDoubtSeparationTolService;
import alkweb.huawei.swindle.system.service.CheatUsrCntService;
import alkweb.huawei.swindle.system.service.CheatUsrInfoService;
import alkweb.huawei.swindle.system.service.CheatUsrWeekService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 * 首页
 */
@Controller
@RequestMapping("/main/page")
public class MainPageController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CheatUsrInfoService cheatUsrInfoService;

    @Autowired
    private CheatUsrCntService cheatUsrCntService;

    @Autowired
    private CheatUsrWeekService cheatUsrWeekService;

    @Autowired
    private CheatDoubtSeparationTolService cheatDoubtSeparationTolService;


    @RequestMapping("/listCheatUsrInfo")
    @ResponseBody
    public Map<String, Object> listCheatUsrInfo(QueryRequest request, MainPageQo data) {
        return super.selectByPageNumSize(request, () -> this.cheatUsrInfoService.findAllCheatUserInfo(data));
    }

    @RequestMapping("/listCheatUsrInfo")
    @ResponseBody
    public Map<String,Object> listCheatUsrCnt(QueryRequest request, MainPageQo data){
        return super.selectByPageNumSize(request,() -> this.cheatUsrCntService.findAllCheatUsrCnt(data));
    }

    @RequestMapping("/listCheatUsrWeek")
    @ResponseBody
    public ResponseBo listCheatUsrWeek(MainPageQo data){
        List<CheatUsrWeekEntity> list = cheatUsrWeekService.findAllCheatUsrWeek(data);
        return ResponseBo.ok(list);
    }

    @RequestMapping("/listSrsm")
    @ResponseBody
    public Map<String,Object> listSrsm(QueryRequest request, MainPageQo data){
        return super.selectByPageNumSize(request,() -> this.cheatDoubtSeparationTolService.findAllCheatDoubtSeparationTol(data));
    }






}
