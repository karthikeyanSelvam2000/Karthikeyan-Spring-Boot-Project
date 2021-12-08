package com.example.alert.service;

import com.example.alert.model.*;

import java.util.List;

public interface AlertService {
    List<AlertFirstModel> getFirst(String name);
    void addFirst(AlertFirstRequest alertFirstRequest);


    List<AlertSecondModel> getSecond(String name);

    void addSecond(AlertSecondRequest alertSecondRequest);

    List<AlertThirdModel> getThird(String name);

    void addThird(AlertThirdRequest alertThirdRequest);
}
