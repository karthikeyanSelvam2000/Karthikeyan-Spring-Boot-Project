package com.example.alert.service;

import com.example.alert.mapper.AlertMapper;
import com.example.alert.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertServiceImpl implements  AlertService{
    @Autowired
    private AlertMapper alertMapper;



    @Override
    public List<AlertFirstModel> getFirst(String name) {
        return alertMapper.getFirst(name);
    }

    @Override
    public void addFirst(AlertFirstRequest alertFirstRequest) {
        AlertFirstModel alertFirstModel=new AlertFirstModel();
        alertFirstModel.setStudent_name(alertFirstRequest.getStudent_name());
        alertFirstModel.setAge(alertFirstRequest.getAge());
        alertFirstModel.setCreated_by(1);
        alertFirstModel.setCreated_on(LocalDateTime.now());
        alertFirstModel.setUpdated_by(1);
        alertFirstModel.setUpdated_on(LocalDateTime.now());
        alertFirstModel.setDelete_flag(false);
        alertMapper.addFirst(alertFirstModel);
    }

    @Override
    public List<AlertSecondModel> getSecond(String name) {
        return alertMapper.getSecond(name);
    }

    @Override
    public void addSecond(AlertSecondRequest alertSecondRequest) {
        AlertSecondModel alertSecondModel=new AlertSecondModel();
        alertSecondModel.setStaff_name(alertSecondRequest.getStaff_name());
        alertSecondModel.setAge(alertSecondRequest.getAge());
        alertSecondModel.setCreated_by(1);
        alertSecondModel.setCreated_on(LocalDateTime.now());
        alertSecondModel.setUpdated_by(1);
        alertSecondModel.setUpdated_on(LocalDateTime.now());
        alertSecondModel.setDelete_flag(false);
        alertMapper.addSecond(alertSecondModel);
    }

    @Override
    public List<AlertThirdModel> getThird(String name) {
        return alertMapper.getThird(name);
    }

    @Override
    public void addThird(AlertThirdRequest alertThirdRequest) {
        AlertThirdModel alertThirdModel=new AlertThirdModel();
        alertThirdModel.setWorker_name(alertThirdRequest.getWorker_name());
        alertThirdModel.setAge(alertThirdRequest.getAge());
        alertThirdModel.setCreated_by(1);
        alertThirdModel.setCreated_on(LocalDateTime.now());
        alertThirdModel.setUpdated_by(1);
        alertThirdModel.setUpdated_on(LocalDateTime.now());
        alertThirdModel.setDelete_flag(false);
        alertMapper.addThird(alertThirdModel);
    }

}
