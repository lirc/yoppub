package cn.microvideo.yoppub.table;

/**
 * 入口流水数据
 * @author wux
 */
public class T_ENTRY {
    /**
     * 程序启动时间
     * 车道程序启动时的系统时间
     */
    private String programstarttime;
    /**
     * 流水号
     * 按记录顺序累加的流水号，车道程序重新启动时为1。
     */
    private String recordno;
    /**
     * 卡网络编号
     */
    private String cardnetwork;
    /**
     * 卡编号
     * 下班记录为当班累积环检过车数；上班记录、手动落杆记录、闯关记录等不确定时为0。
     */
    private String cardid;
    /**
     * 卡物理序列号
     * 转化为无符号整数，再转为字符串，前面不补零
     */
    private String cardserial;
    /**
     * 卡使用计数
     */
    private String cardusedcount;
    /**
     * 卡盒(箱)编码
     * 预留
     */
    private String cardboxno;
    /**
     * 入口网络编号
     */
    private String entrynetwork;
    /**
     * 入口站编号
     */
    private String entrystation;
    /**
     * 入口车道编号
     */
    private String entrylane;
    /**
     * 入口日期及时间
     * 手动落杆及执行上班、下班操作以及闯关发生时间
     */
    private String entrytime;
    /**
     * 入口统计日期
     * 格式为“YYYYMMDD”
     */
    private String entrydate;
    /**
     * 入口收费员编号
     * 当班收费员工号
     */
    private String entryoperator;
    /**
     * 入口收费员班次
     * 1～4
     */
    private String entryshift;
    /**
     * 入口收费班组
     * 预留
     */
    private String operatorshift;
    /**
     * 车型
     * 不确定时为0
     */
    private String vehicleclass;
    /**
     * 改型前车型
     * 不确定时为0
     */
    private String pvehicleclass;
    /**
     * 车种（客、货、集）
     * 不确定时为0；1 客车、2 货车
     */
    private String vehiclekind;
    /**
     * 改型前车种（客、货、集）
     * 不确定时为0
     */
    private String pvehiclekind;
    /**
     * 自动识别车型
     * 预留
     */
    private String vehicleclassauto;
    /**
     * 设备状态
     */
    private String devicestatus;
    /**
     * 记录类型
     */
    private String recordtype;
    /**
     * 程序版本号
     * 按照四段式进行标注
     */
    private String programver;
    /**
     * 车牌自动识别出的牌照
     */
    private String autovlicense;
    /**
     * 车辆牌照
     */
    private String mvlicense;
    /**
     * 记录作废标识
     * 0：正常；1：作废
     */
    private String cancelrecord;
    /**
     * 卡更新标记
     * 预留
     */
    private String cardmark;
    /**
     * 图像保存路径
     * 预留
     */
    private String imagepath;
    /**
     * 图像处理标记
     * 预留
     */
    private String imagestatus;
    /**
     * 总费额（分）
     * 用于大桥收费或开放式收费
     */
    private String totaltoll;
    /**
     * 校验字段密码版本号
     * 用于计算校验码
     */
    private String encrypver;
    /**
     * 识别状态
     * 第0位数值为0表示识别正确，为1表示错误;其余位保留。
     */
    private String identifystatus;
    /**
     * 数据传输标记
     */
    private String transfermark;
    /**
     * ETC卡类型
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
    /**
     * 备用5
     */
    private String spare5;
    /**
     * 备用6
     */
    private String spare6;
    /**
     * 校验码
     */
    private String verifycode;

    public String getProgramstarttime() {
        return programstarttime;
    }

    public void setProgramstarttime(String programstarttime) {
        this.programstarttime = programstarttime;
    }

    public String getRecordno() {
        return recordno;
    }

    public void setRecordno(String recordno) {
        this.recordno = recordno;
    }

    public String getCardnetwork() {
        return cardnetwork;
    }

    public void setCardnetwork(String cardnetwork) {
        this.cardnetwork = cardnetwork;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardserial() {
        return cardserial;
    }

    public void setCardserial(String cardserial) {
        this.cardserial = cardserial;
    }

    public String getCardusedcount() {
        return cardusedcount;
    }

    public void setCardusedcount(String cardusedcount) {
        this.cardusedcount = cardusedcount;
    }

    public String getCardboxno() {
        return cardboxno;
    }

    public void setCardboxno(String cardboxno) {
        this.cardboxno = cardboxno;
    }

    public String getEntrynetwork() {
        return entrynetwork;
    }

    public void setEntrynetwork(String entrynetwork) {
        this.entrynetwork = entrynetwork;
    }

    public String getEntrystation() {
        return entrystation;
    }

    public void setEntrystation(String entrystation) {
        this.entrystation = entrystation;
    }

    public String getEntrylane() {
        return entrylane;
    }

    public void setEntrylane(String entrylane) {
        this.entrylane = entrylane;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntryoperator() {
        return entryoperator;
    }

    public void setEntryoperator(String entryoperator) {
        this.entryoperator = entryoperator;
    }

    public String getEntryshift() {
        return entryshift;
    }

    public void setEntryshift(String entryshift) {
        this.entryshift = entryshift;
    }

    public String getOperatorshift() {
        return operatorshift;
    }

    public void setOperatorshift(String operatorshift) {
        this.operatorshift = operatorshift;
    }

    public String getVehicleclass() {
        return vehicleclass;
    }

    public void setVehicleclass(String vehicleclass) {
        this.vehicleclass = vehicleclass;
    }

    public String getPvehicleclass() {
        return pvehicleclass;
    }

    public void setPvehicleclass(String pvehicleclass) {
        this.pvehicleclass = pvehicleclass;
    }

    public String getVehiclekind() {
        return vehiclekind;
    }

    public void setVehiclekind(String vehiclekind) {
        this.vehiclekind = vehiclekind;
    }

    public String getPvehiclekind() {
        return pvehiclekind;
    }

    public void setPvehiclekind(String pvehiclekind) {
        this.pvehiclekind = pvehiclekind;
    }

    public String getVehicleclassauto() {
        return vehicleclassauto;
    }

    public void setVehicleclassauto(String vehicleclassauto) {
        this.vehicleclassauto = vehicleclassauto;
    }

    public String getDevicestatus() {
        return devicestatus;
    }

    public void setDevicestatus(String devicestatus) {
        this.devicestatus = devicestatus;
    }

    public String getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype;
    }

    public String getProgramver() {
        return programver;
    }

    public void setProgramver(String programver) {
        this.programver = programver;
    }

    public String getAutovlicense() {
        return autovlicense;
    }

    public void setAutovlicense(String autovlicense) {
        this.autovlicense = autovlicense;
    }

    public String getMvlicense() {
        return mvlicense;
    }

    public void setMvlicense(String mvlicense) {
        this.mvlicense = mvlicense;
    }

    public String getCancelrecord() {
        return cancelrecord;
    }

    public void setCancelrecord(String cancelrecord) {
        this.cancelrecord = cancelrecord;
    }

    public String getCardmark() {
        return cardmark;
    }

    public void setCardmark(String cardmark) {
        this.cardmark = cardmark;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getImagestatus() {
        return imagestatus;
    }

    public void setImagestatus(String imagestatus) {
        this.imagestatus = imagestatus;
    }

    public String getTotaltoll() {
        return totaltoll;
    }

    public void setTotaltoll(String totaltoll) {
        this.totaltoll = totaltoll;
    }

    public String getEncrypver() {
        return encrypver;
    }

    public void setEncrypver(String encrypver) {
        this.encrypver = encrypver;
    }

    public String getIdentifystatus() {
        return identifystatus;
    }

    public void setIdentifystatus(String identifystatus) {
        this.identifystatus = identifystatus;
    }

    public String getTransfermark() {
        return transfermark;
    }

    public void setTransfermark(String transfermark) {
        this.transfermark = transfermark;
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

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public String getSpare6() {
        return spare6;
    }

    public void setSpare6(String spare6) {
        this.spare6 = spare6;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }
}
