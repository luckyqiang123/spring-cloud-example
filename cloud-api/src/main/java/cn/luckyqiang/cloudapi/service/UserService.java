package cn.luckyqiang.cloudapi.service;


import cn.luckyqiang.cloudapi.BO.UserServiceBO;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 10:45
 * @Description:
 */
public interface UserService {
    List<UserServiceBO> getUserAddressList(String userId);
}
