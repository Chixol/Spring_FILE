package com.hyungwoo.basic.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller 레이어 : 
// - 클라이언트와 서버간의 접점
// - 클라이언트의 요청을 받고 해당 요청에 대한 응답을 클라이언트에게 돌려주는 영역
// - 각 요청에 해당하는 URL 메서드를 작성하는 영역

// @RestController : JSON 형태의 Response Body를 반환하는 Controller 임을 명시
// @RestController = @Controller + @ResponseBody
@RestController
// @requestMapping() : HTTP 요청에 클래스와 메서드를 매핑하기 위한 어노테이션
// @RequestMapping(value = "/main", method = {RequestMethod.GET}) //이거 잘 안씀
// HTTP GET localhost:4000/main/**
@RequestMapping("/main")
public class BasicController {
    
    // HTTP GET localhost:4000/main/
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String getHello() {
        return "Hello Springboot!!";
    }

    // HTTP GET Method : 클라이언트가 서버로부터 데이터를 받기를 원할때 사용하는 메서드

    // @GetMapping() : RequestMapping 기능을 GET Method에 한정시킨 것 (가독성 + 안정성)
    @GetMapping("/apple")
    public String getApple () {
        return "Get Mapping으로 만든 메서드";
    }

    // HTTP POST Method : 클라이언트가 서버에 데이터를 작성하기 원할때 사용하는 메서드

    // @PostMapping() : RequestMapping 기능을 POST Method에 한정시킨 것 (가독성 + 안정성)
    @PostMapping("/apple")
    public String postApple() {
        return "Post Mapping으로 만든 메서드";
    }

    // HTTP PUT Method : 클라이언트가 서버에 있는 리소스 전체를 수정하고 싶을 때 사용하는 메서드

    // @PutMapping() : RequestMapping 기능을 PUT Method에 한정시킨 것 (가독성 + 안정성)
    @PutMapping("/apple")
    public String putApple() {
        return "Put Mapping으로 만든 메서드";
    }

    // HTTP PATCH Method : 클라이언트가 서버에 있는 리소스 일부를 수정하고 싶을 때 사용하는 메서드

    // @PatchMapping() :  RequestMapping 기능을 PATCH Method에 한정시킨 것 (가독성 + 안정성)
    @PatchMapping("/apple")
    public String patchApple() {
        return "Patch Mapping으로 만든 메서드";
    }

    // HTTP DELETE Method : 클라이언트가 서버에 있는 리소스를 삭제하고 싶을 때 사용하는 메서드

    // @DeleteMapping() :  RequestMapping 기능을 DELETE Method에 한정시킨 것 (가독성 + 안정성)
    @DeleteMapping("/apple")
    public String deleteApple() {
        return "Delete Mapping으로 만든 메서드";
    }
    // Method + URL Pattern이 중복되면 런타임 중에 에러가 발생
    // @DeleteMapping("/apple")
    // public String deleteApple1() {
    //     return "Delete Mapping으로 만든 메서드";
    // }
    
}
