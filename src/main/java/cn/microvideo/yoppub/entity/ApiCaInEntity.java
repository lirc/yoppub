package cn.microvideo.yoppub.entity;


import cn.microvideo.yoppub.table.T_CAR_ENTRY_EXIT;

import java.util.Date;
import java.util.UUID;

/**
 * 车道压线圈抬杆数据
 * @author lirc
 * @date 2018/12/17 15:29
 */
public class ApiCaInEntity extends T_CAR_ENTRY_EXIT {

    public ApiCaInEntity() {

    }

    public ApiCaInEntity(String stationCode, String laneCode) {
        this.setId(UUID.randomUUID().toString().replace("-", ""));
        this.setStationid(stationCode);
        this.setLanecode(laneCode);
        this.setCreatetime(new Date());
    }
}
