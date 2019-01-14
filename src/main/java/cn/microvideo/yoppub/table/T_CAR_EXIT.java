package cn.microvideo.yoppub.table;

/**
 * 车道抬杆数据<redis用>
 * @author wux
 */
public class T_CAR_EXIT extends T_LANE_BASE {
    /**
     * 抬杆时间
     */
    private String exittime;

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }
}
