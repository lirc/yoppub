package cn.microvideo.yoppub.table;

/**
 * 车道状态数据
 * @author wux
 */
public class T_LANE_BASE {
    /**
     * 主键
     */
    private String keyid;
    /**
     * 站号
     */
    private String stationid;
    /**
     * 车道号
     */
    private String laneid;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
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
}
