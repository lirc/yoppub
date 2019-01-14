package cn.microvideo.yoppub.table;

/**
 * 授权数据
 * @author wux
 */
public class T_AUTH_INFO {
    /**
     * 主键
     */
    private String uuid;
    /**
     * 关联ID
     */
    private String entityid;
    /**
     * keyid
     */
    private String keyid;
    /**
     * 授权ID
     * 七位站号+五位车道号+14位时间YYYYMMDDHHMMSS
     */
    private String authid;
    /**
     * 站号
     */
    private String stationid;
    /**
     * 车道号
     */
    private String laneid;
    /**
     * 收费员工号
     */
    private String tollerid;
    /**
     * 班次
     */
    private String shift;
    /**
     * 授权方式
     * 0：远程授权 1：收费班长授权（即卡授权）
     */
    private String method;
    /**
     * 授权请求时间
     */
    private String reqtime;
    /**
     * 授权特情类型
     * 举例：Z1111100101
     */
    private String authtype;
    /**
     * 车型
     */
    private String vehicleclass;
    /**
     * 入口站号
     */
    private String entrystation;
    /**
     * 车牌照
     */
    private String vehiclelicense;
    /**
     * 轴重信息
     */
    private String axisinfo;
    /**
     * 按键记录
     */
    private String keyinfo;
    /**
     * 卡号
     */
    private String cardid;
    /**
     * 授权卡号
     */
    private String authcard;
    /**
     * 收费时间
     */
    private String tollertime;
    /**
     * 授权结果
     */
    private String ackauthid;
    /**
     * 授权人工号
     */
    private String ackoperatorid;
    /**
     * 授权应答时间
     */
    private String acktime;
    /**
     * 授权地点
     * 0: 收费站 1:分中心
     */
    private String authplace;
    /**
     * 图片标记
     * 1 有图片 0 图片缺失
     */
    private String hasimage;
    /**
     * 图片路径
     */
    private String imagepath;
    /**
     * 审核状态
     * 0: 未审核 1：已审核
     */
    private String checkstatus;
    /**
     * 站级审核者
     */
    private String stationchecker;
    /**
     * 中心审核人员
     */
    private String centerchecker;
    /**
     * 站级备注
     */
    private String stationremark;
    /**
     * 中心审核备注
     */
    private String centerremark;
    /**
     * 传输标志
     * 0：未传输 1：已传输
     */
    private String transmark;
    /**
     * 备用1
     */
    private String spare1;
    /**
     * 备用2
     */
    private String spare2;
    /**
     * 备用3
     */
    private String spare3;
    /**
     * 备用4
     */
    private String spare4;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    public String getAuthid() {
        return authid;
    }

    public void setAuthid(String authid) {
        this.authid = authid;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getLaneid() {
        return laneid;
    }

    public void setLaneid(String laneid) {
        this.laneid = laneid;
    }

    public String getTollerid() {
        return tollerid;
    }

    public void setTollerid(String tollerid) {
        this.tollerid = tollerid;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getReqtime() {
        return reqtime;
    }

    public void setReqtime(String reqtime) {
        this.reqtime = reqtime;
    }

    public String getAuthtype() {
        return authtype;
    }

    public void setAuthtype(String authtype) {
        this.authtype = authtype;
    }

    public String getVehicleclass() {
        return vehicleclass;
    }

    public void setVehicleclass(String vehicleclass) {
        this.vehicleclass = vehicleclass;
    }

    public String getEntrystation() {
        return entrystation;
    }

    public void setEntrystation(String entrystation) {
        this.entrystation = entrystation;
    }

    public String getVehiclelicense() {
        return vehiclelicense;
    }

    public void setVehiclelicense(String vehiclelicense) {
        this.vehiclelicense = vehiclelicense;
    }

    public String getAxisinfo() {
        return axisinfo;
    }

    public void setAxisinfo(String axisinfo) {
        this.axisinfo = axisinfo;
    }

    public String getKeyinfo() {
        return keyinfo;
    }

    public void setKeyinfo(String keyinfo) {
        this.keyinfo = keyinfo;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getAuthcard() {
        return authcard;
    }

    public void setAuthcard(String authcard) {
        this.authcard = authcard;
    }

    public String getTollertime() {
        return tollertime;
    }

    public void setTollertime(String tollertime) {
        this.tollertime = tollertime;
    }

    public String getAckauthid() {
        return ackauthid;
    }

    public void setAckauthid(String ackauthid) {
        this.ackauthid = ackauthid;
    }

    public String getAckoperatorid() {
        return ackoperatorid;
    }

    public void setAckoperatorid(String ackoperatorid) {
        this.ackoperatorid = ackoperatorid;
    }

    public String getAcktime() {
        return acktime;
    }

    public void setAcktime(String acktime) {
        this.acktime = acktime;
    }

    public String getAuthplace() {
        return authplace;
    }

    public void setAuthplace(String authplace) {
        this.authplace = authplace;
    }

    public String getHasimage() {
        return hasimage;
    }

    public void setHasimage(String hasimage) {
        this.hasimage = hasimage;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getStationchecker() {
        return stationchecker;
    }

    public void setStationchecker(String stationchecker) {
        this.stationchecker = stationchecker;
    }

    public String getCenterchecker() {
        return centerchecker;
    }

    public void setCenterchecker(String centerchecker) {
        this.centerchecker = centerchecker;
    }

    public String getStationremark() {
        return stationremark;
    }

    public void setStationremark(String stationremark) {
        this.stationremark = stationremark;
    }

    public String getCenterremark() {
        return centerremark;
    }

    public void setCenterremark(String centerremark) {
        this.centerremark = centerremark;
    }

    public String getTransmark() {
        return transmark;
    }

    public void setTransmark(String transmark) {
        this.transmark = transmark;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }
}
