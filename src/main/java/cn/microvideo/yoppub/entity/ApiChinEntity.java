package cn.microvideo.yoppub.entity;


import cn.microvideo.yoppub.table.T_CHECK_IN_INFO;

/**
 * 值机数据
 * @author wux
 */
public class ApiChinEntity extends T_CHECK_IN_INFO {
    // 值机员用户id(工位)
    private String userid;
    // 工位ip
    private String workip;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getWorkip() {
        return workip;
    }

    public void setWorkip(String workip) {
        this.workip = workip;
    }
}
