package cn.luckyqiang.cloudprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/09/25 10:30
 * @Description:
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        List<ServiceInstance> instances = discoveryClient.getInstances("hello-service");
        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World";
    }
}
