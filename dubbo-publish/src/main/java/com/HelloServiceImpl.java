package com;


import org.springframework.stereotype.Service;

/**
 * @author majiabao on 2018/1/29.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return name + " ni hao";
    }
}
