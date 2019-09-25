package cn.luckyqiang.cloudprovider.impl;



import cn.luckyqiang.cloudapi.BO.UserServiceBO;
import cn.luckyqiang.cloudapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 10:49
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserServiceBO> getUserAddressList(String userId) {
        UserServiceBO address1 = new UserServiceBO(1, "北京市昌平区科技园", "1", "李老师", "13823838438", "Y");
        UserServiceBO address2 = new UserServiceBO(1, "深圳市南山区腾讯滨海大厦", "1", "马化楞", "15666531259", "Y");
        return Arrays.asList(address1, address2);
    }
}
