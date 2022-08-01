package com.say.controller;


import com.say.commom.core.R;
import com.say.config.QueryGrantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrantController {


    @Autowired
    private QueryGrantTypeService queryGrantTypeService;


    /**
     * 获取会员等级2
     *
     * @return
     */
    @GetMapping("/getVip")
    public R getVip(String vip) {

        return R.success(queryGrantTypeService.getResult(vip));
    }


}
