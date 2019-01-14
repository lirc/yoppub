package cn.microvideo.yoppub.table;

/**
 * 车道状态数据
 * @author wux
 */
public class T_LANE_STATE extends T_LANE_BASE {
    /**
     * 摄像头状态
     */
    private String camerastate;
    /**
     * 打印机状态
     */
    private String printerstate;
    /**
     * 车道状态
     */
    private String lanestate;
    /**
     * 收费员姓名
     */
    private String tollname;
    /**
     * 收费员工号
     */
    private String tollcode;

    public String getCamerastate() {
        return camerastate;
    }

    public void setCamerastate(String camerastate) {
        this.camerastate = camerastate;
    }

    public String getPrinterstate() {
        return printerstate;
    }

    public void setPrinterstate(String printerstate) {
        this.printerstate = printerstate;
    }

    public String getLanestate() {
        return lanestate;
    }

    public void setLanestate(String lanestate) {
        this.lanestate = lanestate;
    }

    public String getTollname() {
        return tollname;
    }

    public void setTollname(String tollname) {
        this.tollname = tollname;
    }

    public String getTollcode() {
        return tollcode;
    }

    public void setTollcode(String tollcode) {
        this.tollcode = tollcode;
    }
}
