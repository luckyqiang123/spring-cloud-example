package cn.luckyqiang.cloudprovider.controller;

import cn.luckyqiang.cloudapi.BO.UserServiceBO;
import cn.luckyqiang.cloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 15:14
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public List<UserServiceBO> getAllUser(String userId) {
        List<UserServiceBO> userServiceBOList = userService.getUserAddressList(userId);
        return userServiceBOList;
    }
}
