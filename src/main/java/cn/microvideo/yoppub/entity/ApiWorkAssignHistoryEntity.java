package cn.microvideo.yoppub.entity;

import java.util.Date;

/**
 * 工位分配历史记录数据实体类
 * @author lirc
 * @date 2019/1/10 16:48
 */
public class ApiWorkAssignHistoryEntity extends ApiWorkInfoEntity {

    /**
     * 分配日期
     */
    private Date assignDate;

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }
}
