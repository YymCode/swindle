package alkweb.huawei.swindle.system.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/12
 */
@Table(name = "masarp.ta_rp_cheat_chnl_insert_d")
public class BlackListEntity implements Serializable {
    private static final long serialVersionUID = 4937918992737764479L;

    @Column(name = "RECORD_ID")
    private String recordId;

    @Column(name = "AREA_ID")
    private Integer areaId;

    @Column(name = "AREA_NAME")
    private String areaName;

    @Column(name = "CNTY_ID")
    private String cntyId;

    @Column(name = "CNTY_NAME")
    private String cntyName;

    @Column(name = "CHNL_ID")
    private String chnlId;

    @Column(name = "CHNL_NAME")
    private String chnlName;

    @Column(name = "ROAM_AREA_ID")
    private String roamAreaId;

    @Column(name = "ROAM_AREA_NAME")
    private String roamAreaName;

    @Column(name = "VAL_DATE")
    private Date valDate;

    @Column(name = "INVAL_DATE")
    private Date invalDate;

    @Column(name = "STAFF_ID")
    private String staffId;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "STATUS")
    private Integer status;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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

    public String getCntyId() {
        return cntyId;
    }

    public void setCntyId(String cntyId) {
        this.cntyId = cntyId;
    }

    public String getCntyName() {
        return cntyName;
    }

    public void setCntyName(String cntyName) {
        this.cntyName = cntyName;
    }

    public String getChnlId() {
        return chnlId;
    }

    public void setChnlId(String chnlId) {
        this.chnlId = chnlId;
    }

    public String getChnlName() {
        return chnlName;
    }

    public void setChnlName(String chnlName) {
        this.chnlName = chnlName;
    }

    public String getRoamAreaId() {
        return roamAreaId;
    }

    public void setRoamAreaId(String roamAreaId) {
        this.roamAreaId = roamAreaId;
    }

    public String getRoamAreaName() {
        return roamAreaName;
    }

    public void setRoamAreaName(String roamAreaName) {
        this.roamAreaName = roamAreaName;
    }

    public Date getValDate() {
        return valDate;
    }

    public void setValDate(Date valDate) {
        this.valDate = valDate;
    }

    public Date getInvalDate() {
        return invalDate;
    }

    public void setInvalDate(Date invalDate) {
        this.invalDate = invalDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("recordId", recordId)
                .add("areaId", areaId)
                .add("areaName", areaName)
                .add("cntyId", cntyId)
                .add("cntyName", cntyName)
                .add("chnlId", chnlId)
                .add("chnlName", chnlName)
                .add("roamAreaId", roamAreaId)
                .add("roamAreaName", roamAreaName)
                .add("valDate", valDate)
                .add("invalDate", invalDate)
                .add("staffId", staffId)
                .add("updateTime", updateTime)
                .add("status", status)
                .toString();
    }
}
