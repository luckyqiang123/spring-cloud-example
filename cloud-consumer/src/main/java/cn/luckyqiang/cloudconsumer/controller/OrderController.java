package cn.luckyqiang.cloudconsumer.controller;

import cn.luckyqiang.cloudapi.BO.UserServiceBO;
import cn.luckyqiang.cloudapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 11:13
 * @Description:
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserServiceBO> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }

    @GetMapping("/deal/{userId}")
    public List<UserServiceBO> getOrder(String userId) {
        return this.restTemplate.getForObject("http://localhost:8093/" + userId, List.class);
    }



}
