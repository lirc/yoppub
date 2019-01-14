package cn.microvideo.yoppub.table;

/**
 * 车道数据
 * @author lirc
 * @date 2018/12/19 14:36
 */
public class T_LANE_INFO {

    /** id */
    private String id;

    /** 收费站编号 */
    private String stationid;

    /** 收费站名 */
    private String stationname;

    /** 车道号 */
    private String laneid;

    /** 车道名 */
    private String lanename;

    /** 车道IP */
    private String laneip;

    /** 车道类型 */
    private Integer lanetype;

    /** 电话号码 */
    private String lanetel;

    /** 摄像机url */
    private String cameraurl;

    /** 摄像机令牌1 */
    private String cameratk1;

    /** 摄像机令牌2 */
    private String cameratk2;

    /** 摄像机令牌3 */
    private String cameratk3;

    /** 摄像机令牌4 */
    private String cameratk4;

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

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getLaneid() {
        return laneid;
    }

    public void setLaneid(String laneid) {
        this.laneid = laneid;
    }

    public String getLaneip() {
        return laneip;
    }

    public void setLaneip(String laneip) {
        this.laneip = laneip;
    }

    public Integer getLanetype() {
        return lanetype;
    }

    public void setLanetype(Integer lanetype) {
        this.lanetype = lanetype;
    }

    public String getLanetel() {
        return lanetel;
    }

    public void setLanetel(String lanetel) {
        this.lanetel = lanetel;
    }

    public String getCameraurl() {
        return cameraurl;
    }

    public void setCameraurl(String cameraurl) {
        this.cameraurl = cameraurl;
    }

    public String getCameratk1() {
        return cameratk1;
    }

    public void setCameratk1(String cameratk1) {
        this.cameratk1 = cameratk1;
    }

    public String getCameratk2() {
        return cameratk2;
    }

    public void setCameratk2(String cameratk2) {
        this.cameratk2 = cameratk2;
    }

    public String getCameratk3() {
        return cameratk3;
    }

    public void setCameratk3(String cameratk3) {
        this.cameratk3 = cameratk3;
    }

    public String getCameratk4() {
        return cameratk4;
    }

    public void setCameratk4(String cameratk4) {
        this.cameratk4 = cameratk4;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLanename() {
        return lanename;
    }

    public void setLanename(String lanename) {
        this.lanename = lanename;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
