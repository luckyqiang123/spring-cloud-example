package cn.luckyqiang.cloudconsumer.impl;

import cn.luckyqiang.cloudapi.BO.UserServiceBO;
import cn.luckyqiang.cloudapi.service.OrderService;
import cn.luckyqiang.cloudapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 11:02
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    private UserService userService;

    @Override
    public List<UserServiceBO> initOrder(String userId) {
        System.out.println("用户id：" + userId);
        List<UserServiceBO> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
