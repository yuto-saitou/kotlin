package com.example._427demo.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@Controller
@RestController//Json形式で返す
@RequestMapping("home")

class HomeController {

    @GetMapping("/top")
    fun top(): String{
        return "top"
    }

    @PostMapping("/list")
    fun list(): String{
        return "list"
    }

}