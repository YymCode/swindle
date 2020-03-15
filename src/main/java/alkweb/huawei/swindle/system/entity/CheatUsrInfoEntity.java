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
@Table(name = "masarp.ta_rp_cheat_usr_info_d")
public class CheatUsrInfoEntity implements Serializable {

    private static final long serialVersionUID = 7864238362108693208L;

    @Column(name = "statis_date")
    private Integer statisDate;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "roam_comm_prov_id")
    private String roamCommProvId;

    @Column(name = "roam_comm_prov_name")
    private String roamCommProvName;

    @Column(name = "roam_comm_area_id")
    private String roamCommAreaId;

    @Column(name = "roam_comm_area_name")
    private String roamCommAreaName;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRoamCommProvId() {
        return roamCommProvId;
    }

    public void setRoamCommProvId(String roamCommProvId) {
        this.roamCommProvId = roamCommProvId;
    }

    public String getRoamCommProvName() {
        return roamCommProvName;
    }

    public void setRoamCommProvName(String roamCommProvName) {
        this.roamCommProvName = roamCommProvName;
    }

    public String getRoamCommAreaId() {
        return roamCommAreaId;
    }

    public void setRoamCommAreaId(String roamCommAreaId) {
        this.roamCommAreaId = roamCommAreaId;
    }

    public String getRoamCommAreaName() {
        return roamCommAreaName;
    }

    public void setRoamCommAreaName(String roamCommAreaName) {
        this.roamCommAreaName = roamCommAreaName;
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
                .add("updateTime", updateTime)
                .add("roamCommProvId", roamCommProvId)
                .add("roamCommProvName", roamCommProvName)
                .add("roamCommAreaId", roamCommAreaId)
                .add("roamCommAreaName", roamCommAreaName)
                .add("cheatCount", cheatCount)
                .add("cheatRate", cheatRate)
                .add("warnLevel", warnLevel)
                .toString();
    }
}
