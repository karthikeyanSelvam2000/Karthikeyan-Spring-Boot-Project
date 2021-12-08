package com.example.alert.controller;

import com.example.alert.model.*;
import com.example.alert.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alert")
public class AlertController {
    @Autowired
    private AlertService alertService;
    @GetMapping("/getFirst")
    private ResponseEntity<?> getFirst(@RequestParam(value = "name", required = false) String name){
        List<AlertFirstModel> list=null;
        try {
            list = alertService.getFirst(name);
        }catch(Exception e){
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(list);
    }
    @PostMapping("/postFirst")
    private ResponseEntity<?> addFirst(@RequestBody AlertFirstRequest alertFirstRequest){
        String ans="null";
        try {
           alertService.addFirst(alertFirstRequest);
           ans="Inserted Successfully";
        }catch(Exception e)
        {
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(ans);
    }

    @GetMapping("/getSecond")
    private ResponseEntity<?> getSecond(@RequestParam(value = "name", required = false) String name){
        List<AlertSecondModel> list=null;
        try {
            list = alertService.getSecond(name);
        }catch(Exception e){
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(list);
    }
    @PostMapping("/postSecond")
    private ResponseEntity<?> addSecond(@RequestBody AlertSecondRequest alertSecondRequest){
        String ans="null";
        try {
            alertService.addSecond(alertSecondRequest);
            ans="Inserted Successfully";
        }catch(Exception e)
        {
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(ans);
    }

    @GetMapping("/getThird")
    private ResponseEntity<?> getThird(@RequestParam(value = "name", required = false) String name){
        List<AlertThirdModel> list=null;
        try {
            list = alertService.getThird(name);
        }catch(Exception e){
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(list);
    }
    @PostMapping("/postThird")
    private ResponseEntity<?> addThird(@RequestBody AlertThirdRequest alertThirdRequest){
        String ans="null";
        try {
            alertService.addThird(alertThirdRequest);
            ans="Inserted Successfully";
        }catch(Exception e)
        {
            return CommonWebUtils.failureResponse(e.getMessage(), ResponseCode.USER_INFO_ERROR_CODE);
        }
        return CommonWebUtils.successResponse(ans);
    }

}
