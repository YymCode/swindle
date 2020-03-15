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
@Table(name = "masarp.ta_rp_cheat_index_week_d")
public class CheatUsrWeekEntity implements Serializable {
    private static final long serialVersionUID = 1493113574420604626L;

    @Column(name = "statis_date")
    private Integer statisDate;

    @Column(name = "week")
    private String week;

    @Column(name = "cheat_count")
    private Integer cheatCount;

    @Column(name = "input_cheat_cnt")
    private Integer inputCheatCnt;

    @Column(name = "file_cnt")
    private Integer fileCnt;

    @Column(name = "audit_file_cnt")
    private Integer auditFileCnt;

    @Column(name = "audited_count")
    private Integer auditedCount;

    @Column(name = "smz_cheat_count")
    private Integer smzCheatCount;

    public Integer getStatisDate() {
        return statisDate;
    }

    public void setStatisDate(Integer statisDate) {
        this.statisDate = statisDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Integer getCheatCount() {
        return cheatCount;
    }

    public void setCheatCount(Integer cheatCount) {
        this.cheatCount = cheatCount;
    }

    public Integer getInputCheatCnt() {
        return inputCheatCnt;
    }

    public void setInputCheatCnt(Integer inputCheatCnt) {
        this.inputCheatCnt = inputCheatCnt;
    }

    public Integer getFileCnt() {
        return fileCnt;
    }

    public void setFileCnt(Integer fileCnt) {
        this.fileCnt = fileCnt;
    }

    public Integer getAuditFileCnt() {
        return auditFileCnt;
    }

    public void setAuditFileCnt(Integer auditFileCnt) {
        this.auditFileCnt = auditFileCnt;
    }

    public Integer getAuditedCount() {
        return auditedCount;
    }

    public void setAuditedCount(Integer auditedCount) {
        this.auditedCount = auditedCount;
    }

    public Integer getSmzCheatCount() {
        return smzCheatCount;
    }

    public void setSmzCheatCount(Integer smzCheatCount) {
        this.smzCheatCount = smzCheatCount;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("statisDate", statisDate)
                .add("week", week)
                .add("cheatCount", cheatCount)
                .add("inputCheatCnt", inputCheatCnt)
                .add("fileCnt", fileCnt)
                .add("auditFileCnt", auditFileCnt)
                .add("auditedCount", auditedCount)
                .add("smzCheatCount", smzCheatCount)
                .toString();
    }
}
