package cn.microvideo.yoppub.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 根据值机分配算法查询电话号码返回对象
 *
 * @author lirc
 */
@XmlRootElement(name = "info")
public class ApiCheckMoEntity {
    /**
     * 是否成功标识
     */
    private String execute = "0";
    /**
     * 返回信息
     */
    private String message = "success!";
    /**
     * 电话号码
     */
    private String checkPhone;

    public ApiCheckMoEntity() {

    }

    public ApiCheckMoEntity(String execute, String message, String checkPhone) {
        this.execute = execute;
        this.message = message;
        this.checkPhone = checkPhone;
    }

    public String getExecute() {
        return execute;
    }

    public void setExecute(String execute) {
        this.execute = execute;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCheckPhone() {
        return checkPhone;
    }

    public void setCheckPhone(String checkPhone) {
        this.checkPhone = checkPhone;
    }
}
