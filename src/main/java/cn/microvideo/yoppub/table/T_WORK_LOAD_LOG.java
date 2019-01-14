package cn.microvideo.yoppub.table;

import java.util.Date;

/**
 * 工作量数据
 * @author lirc
 */
public class T_WORK_LOAD_LOG {

    /**
     * 主键
     */
    private String id;
    /**
     * 关联ID
     */
    private String entityid;
    /**
     * 工位编号
     */
    private String workcode;
    /**
     * 操作人ID
     */
    private String operatorid;
    /**
     * 操作人姓名
     */
    private String operatorname;
    /**
     * 操作时间
     */
    private Date operatetime;
    /**
     * 备注
     */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
