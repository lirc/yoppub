package cn.microvideo.yoppub.entity;


import cn.microvideo.yoppub.table.T_LANE_INFO;

/**
 * 车道数据
 * @author lirc
 * @date 2018/12/19 14:56
 */
public class ApiLaneInfoEntity extends T_LANE_INFO {

    public String[] getTokenArr(){
        return new String[]{this.getCameratk1(), this.getCameratk2(), this.getCameratk3(), this.getCameratk4()};
    }
}
