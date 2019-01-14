package cn.microvideo.yoppub.table;

/**
 * 值机数据
 * @author wux
 */
public class T_CHECK_IN_INFO {

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
    private String checkid;
    /**
     * 站号
     */
    private String stationid;
    /**
     * 录入时间
     */
    private String inputtime;
    /**
     * 出口时间
     */
    private String exittime;
    /**
     * 流水号
     */
    private String recordid;
    /**
     * 操作员工号
     */
    private String operatorid;
    /**
     * 日期
     */
    private String statisticsdate;
    /**
     * 班次
     */
    private String statisticsshift;
    /**
     * 录入类型
     */
    private String inputtype;
    /**
     * 收费日期
     */
    private String tolldate;
    /**
     * 收费班次
     */
    private String tollshift;
    /**
     * 车道号
     */
    private String laneid;
    /**
     * 收费员工号
     */
    private String tollid;
    /**
     * 车型
     */
    private String vehicleclass;
    /**
     * 车牌
     */
    private String mvlicense;
    /**
     * 值机录入信息
     */
    private String checkevent;
    /**
     * 传输标记
     */
    private String transfermark;
    /**
     * 处理标记
     */
    private String flag;
    /**
     * 追加标记
     */
    private String addflag;
    /**
     * 追加信息
     */
    private String addevent;
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

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public String getStatisticsdate() {
        return statisticsdate;
    }

    public void setStatisticsdate(String statisticsdate) {
        this.statisticsdate = statisticsdate;
    }

    public String getStatisticsshift() {
        return statisticsshift;
    }

    public void setStatisticsshift(String statisticsshift) {
        this.statisticsshift = statisticsshift;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype;
    }

    public String getTolldate() {
        return tolldate;
    }

    public void setTolldate(String tolldate) {
        this.tolldate = tolldate;
    }

    public String getTollshift() {
        return tollshift;
    }

    public void setTollshift(String tollshift) {
        this.tollshift = tollshift;
    }

    public String getLaneid() {
        return laneid;
    }

    public void setLaneid(String laneid) {
        this.laneid = laneid;
    }

    public String getTollid() {
        return tollid;
    }

    public void setTollid(String tollid) {
        this.tollid = tollid;
    }

    public String getVehicleclass() {
        return vehicleclass;
    }

    public void setVehicleclass(String vehicleclass) {
        this.vehicleclass = vehicleclass;
    }

    public String getMvlicense() {
        return mvlicense;
    }

    public void setMvlicense(String mvlicense) {
        this.mvlicense = mvlicense;
    }

    public String getCheckevent() {
        return checkevent;
    }

    public void setCheckevent(String checkevent) {
        this.checkevent = checkevent;
    }

    public String getTransfermark() {
        return transfermark;
    }

    public void setTransfermark(String transfermark) {
        this.transfermark = transfermark;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAddflag() {
        return addflag;
    }

    public void setAddflag(String addflag) {
        this.addflag = addflag;
    }

    public String getAddevent() {
        return addevent;
    }

    public void setAddevent(String addevent) {
        this.addevent = addevent;
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
