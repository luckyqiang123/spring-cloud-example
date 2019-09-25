package cn.luckyqiang.cloudapi.BO;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 10:46
 * @Description:
 */
public class UserServiceBO {

    private  Integer id;
    private String userAddress;
    private String userid;
    private String consignee;
    private String phoneNbr;
    private String isDefault;

    public UserServiceBO(Integer id, String userAddress, String userid, String consignee, String phoneNbr, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userid = userid;
        this.consignee = consignee;
        this.phoneNbr = phoneNbr;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
