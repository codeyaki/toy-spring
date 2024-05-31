package com.codeyaki.toyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lotto")
public class lotto {

    @GetMapping
    public String getLottoPage() {
        return "lotto";
    }

}
