package controller;

import com.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author majiabao on 2018/1/29.
 */
@Controller
@RequestMapping("/door")
public class DoorController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/sayHi")
    @ResponseBody
    public String sayHi(String name) {
        return helloService.sayHi(name);
    }
}
