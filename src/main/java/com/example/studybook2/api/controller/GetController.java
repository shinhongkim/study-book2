package com.example.studybook2.api.controller;

import com.example.studybook2.api.dto.MemberDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/")
@Tag(name="name get controller",description = "get 디스크립션")
public class GetController {

    @Operation(summary="summary name",description = "description get")
    @GetMapping("/name")
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/value1/{valueData}")
    public String getValue(@PathVariable String valueData){
        return valueData;
    }
    @GetMapping("/value2/{valueData}")
    public String getValueData(@PathVariable("valueData") String var){
        return var;
    }

    @GetMapping("/req1")
    public String getReqParam(@RequestParam String name,@RequestParam String email){
        return name;
    }

    @GetMapping("/request2")
    public String getRequestParams(@RequestParam Map<String ,String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map->{
            sb.append(map.getKey()+":"+map.getValue()+"\n");
        });

        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDto dto){
        return dto.toString();
    }
}
