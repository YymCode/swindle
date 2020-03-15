package alkweb.huawei.swindle.system.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "masarp.ta_rp_fzp_usr_log_d")
public class SysLogEntity implements Serializable {


    private static final long serialVersionUID = 8700211503584463898L;



	@Column(name = "ID")
	private Long id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "OPERATION_NAME")
	private String operationName;

	@Column(name = "OPERATION_TIME")
	private Long operationTime;

	@Column(name = "OPERATION_METHOD")
	private String operationMethod;

	@Column(name = "OPERATION_PARAMS")
	private String operationParams;

	@Column(name = "CREATE_TIME")
	private Date createTime;

	// 用于搜索条件中的时间字段
	@Transient
	private String timeField;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {

        /*this.operation = operation == null ? null : operation.trim();*/
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public Long getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Long operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationMethod() {
        return operationMethod;
    }

    public void setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod == null ? null : operationMethod.trim();
    }

    public String getOperationParams() {
        return operationParams;
    }

    public void setOperationParams(String operationParams) {
        this.operationParams = operationParams == null ? null : operationParams.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTimeField() {
        return timeField;
    }

    public void setTimeField(String timeField) {
        this.timeField = timeField;
    }
}