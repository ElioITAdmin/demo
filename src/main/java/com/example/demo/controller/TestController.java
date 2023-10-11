package com.example.demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ResponseEntity hello() {
        return ResponseEntity.ok("베포");
    }
}
