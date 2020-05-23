package com.codebubbling.login.web;


import com.codebubby.common.web.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("v1/login")
public class LoginController {

    @RequestMapping
    public Result<Date> login() {
        log.info("login");
        Result<Date> result = new Result<>();
        result.setCode("0");
        result.setResult(new Date());
        return result;
    }


}
