package com.say.controller;


import com.say.commom.core.R;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
public class Index {

    @GetMapping
    public R index() {
        return R.success("萨瓦迪卡");
    }

}
