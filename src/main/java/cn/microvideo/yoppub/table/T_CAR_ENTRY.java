package cn.microvideo.yoppub.table;

/**
 * 车道压线圈数据<redis用>
 * @author wux
 */
public class T_CAR_ENTRY extends T_LANE_BASE {
    /**
     * 压线圈时间
     */
    private String entrytime;

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }
}
