package cn.sunshinehubery.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 19:40
 * @Version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SunshineServiceConsumerApplication.class)
public class LoadBalanceTest {
    @Autowired
    private RibbonLoadBalancerClient balancerClient;

    @Test
    public void testLoadBalance(){
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = this.balancerClient.choose("service-provider");
            System.out.println(instance.getHost() + ":" +instance.getPort());
        }
    }
}
