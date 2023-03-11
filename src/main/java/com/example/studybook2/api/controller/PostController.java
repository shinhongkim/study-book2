package com.example.studybook2.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/member")
    public String postMember(@RequestBody Map<String,Object> postData){
        StringBuilder sb =  new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey()+":"+map.getValue()+"\n");
        });

        return sb.toString();
    }
}
