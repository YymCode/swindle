package alkweb.huawei.swindle.system.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
@Table(name = "masarp.ta_rp_cheat_usr_cnt_d")
public class CheatUsrCntEntity implements Serializable {

    private static final long serialVersionUID = -8135119872522219906L;

    @Column(name = "statis_date")
    private Integer statisDate;

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "cheat_count")
    private Integer cheatCount;

    @Column(name = "cheat_rate")
    private float cheatRate;

    @Column(name = "warn_level")
    private String warnLevel;

    public Integer getStatisDate() {
        return statisDate;
    }

    public void setStatisDate(Integer statisDate) {
        this.statisDate = statisDate;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getCheatCount() {
        return cheatCount;
    }

    public void setCheatCount(Integer cheatCount) {
        this.cheatCount = cheatCount;
    }

    public float getCheatRate() {
        return cheatRate;
    }

    public void setCheatRate(float cheatRate) {
        this.cheatRate = cheatRate;
    }

    public String getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(String warnLevel) {
        this.warnLevel = warnLevel;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("statisDate", statisDate)
                .add("areaId", areaId)
                .add("areaName", areaName)
                .add("cheatCount", cheatCount)
                .add("cheatRate", cheatRate)
                .add("warnLevel", warnLevel)
                .toString();
    }
}
