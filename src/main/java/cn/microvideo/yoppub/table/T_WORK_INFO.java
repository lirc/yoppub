package cn.microvideo.yoppub.table;

/**
 * 工位数据
 * @author lirc
 * @date 2018/12/19 14:36
 */
public class T_WORK_INFO {
    /** id */
    private String id;
    /** 编号 */
    private String workcode;
    /** ip */
    private String workip;
    /** 电话 */
    private String worktel;
    /** 工位状态 0-上班 1-下班(退出) 2-离岗 */
    private String workstatus;
    /** 电话状态 */
    private String telstatus;
    /** 是否启用 0未启用 1启用 */
    private String enabled;
    /** 备注 */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode;
    }

    public String getWorkip() {
        return workip;
    }

    public void setWorkip(String workip) {
        this.workip = workip;
    }

    public String getWorktel() {
        return worktel;
    }

    public void setWorktel(String worktel) {
        this.worktel = worktel;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public String getTelstatus() {
        return telstatus;
    }

    public void setTelstatus(String telstatus) {
        this.telstatus = telstatus;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
