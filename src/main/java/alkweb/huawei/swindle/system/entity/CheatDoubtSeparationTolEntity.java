package alkweb.huawei.swindle.system.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
@Table(name = "masarp.ta_rp_cheat_doubt_separation_tol_d")
public class CheatDoubtSeparationTolEntity implements Serializable {

    private static final long serialVersionUID = 292790773946767141L;

    @Column(name = "statis_date")
    private Integer statisDate;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "usr_num")
    private Integer usrNum;

    @Column(name = "cheat_num")
    private Integer cheatNum;

    @Column(name = "cheat_rate")
    private Double cheatRate;

    @Column(name = "cheat_num1")
    private Integer cheatNum1;//其中：高危用户数

    @Column(name = "cheatNum2")
    private Integer cheatNum2;//中危

    @Column(name = "cheatNum3")
    private Integer cheatNum3;//低危

    public Integer getStatisDate() {
        return statisDate;
    }

    public void setStatisDate(Integer statisDate) {
        this.statisDate = statisDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getUsrNum() {
        return usrNum;
    }

    public void setUsrNum(Integer usrNum) {
        this.usrNum = usrNum;
    }

    public Integer getCheatNum() {
        return cheatNum;
    }

    public void setCheatNum(Integer cheatNum) {
        this.cheatNum = cheatNum;
    }

    public Double getCheatRate() {
        return cheatRate;
    }

    public void setCheatRate(Double cheatRate) {
        this.cheatRate = cheatRate;
    }

    public Integer getCheatNum1() {
        return cheatNum1;
    }

    public void setCheatNum1(Integer cheatNum1) {
        this.cheatNum1 = cheatNum1;
    }

    public Integer getCheatNum2() {
        return cheatNum2;
    }

    public void setCheatNum2(Integer cheatNum2) {
        this.cheatNum2 = cheatNum2;
    }

    public Integer getCheatNum3() {
        return cheatNum3;
    }

    public void setCheatNum3(Integer cheatNum3) {
        this.cheatNum3 = cheatNum3;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("statisDate", statisDate)
                .add("updateTime", updateTime)
                .add("areaId", areaId)
                .add("areaName", areaName)
                .add("usrNum", usrNum)
                .add("cheatNum", cheatNum)
                .add("cheatRate", cheatRate)
                .add("cheatNum1", cheatNum1)
                .add("cheatNum2", cheatNum2)
                .add("cheatNum3", cheatNum3)
                .toString();
    }
}
