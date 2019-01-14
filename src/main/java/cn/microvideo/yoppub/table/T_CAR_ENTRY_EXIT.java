package cn.microvideo.yoppub.table;

import java.util.Date;

/**
 * 车道进出流水数据
 * @author lirc
 * @date 2018/12/25 11:17
 */
public class T_CAR_ENTRY_EXIT {
    /**
     * 主键
     */
    private String id;
    /**
     * 收费站号
     */
    private String stationid;
    /**
     * 车道号
     */
    private String laneid;
    /**
     * 压线圈id
     */
    private String entryid;
    /**
     * 压线圈时间
     */
    private String entrytime;
    /**
     * 抬杆id
     */
    private String exitid;
    /**
     * 抬杆时间
     */
    private String exittime;
    /**
     * 插入时间
     */
    private Date createtime;
    /**
     * 工位编号
     */
    private String workcode;

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

    public String getLanecode() {
        return laneid;
    }

    public void setLanecode(String laneid) {
        this.laneid = laneid;
    }

    public String getEntryid() {
        return entryid;
    }

    public void setEntryid(String entryid) {
        this.entryid = entryid;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getExitid() {
        return exitid;
    }

    public void setExitid(String exitid) {
        this.exitid = exitid;
    }

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode;
    }
}
