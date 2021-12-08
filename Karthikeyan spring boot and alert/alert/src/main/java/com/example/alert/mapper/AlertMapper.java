package com.example.alert.mapper;

import com.example.alert.model.AlertFirstModel;
import com.example.alert.model.AlertThirdModel;
import com.example.alert.model.AlertSecondModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
@MapperScan("com.example.alert.mapper")
public interface AlertMapper {

    @Select("select * from first_table where student_name=#{name}")
    List<AlertFirstModel> getFirst(String name);

    @Insert("insert into first_table(student_name,age,created_by,created_on,updated_by,updated_on,delete_flag) Values(#{student_name},#{age},#{created_by},#{created_on},#{updated_by},#{updated_on},#{delete_flag})")
    void addFirst(AlertFirstModel alertFirstModel);

    @Select("select * from second_table where staff_name=#{name}")
    List<AlertSecondModel> getSecond(String name);

    @Select("select * from third_table where worker_name=#{name}")
    List<AlertThirdModel> getThird(String name);

    @Insert("insert into second_table(staff_name,age,created_by,created_on,updated_by,updated_on,delete_flag) Values(#{staff_name},#{age},#{created_by},#{created_on},#{updated_by},#{updated_on},#{delete_flag})")
    void addSecond(AlertSecondModel alertSecondModel);

    @Insert("insert into third_table(worker_name,age,created_by,created_on,updated_by,updated_on,delete_flag) Values(#{worker_name},#{age},#{created_by},#{created_on},#{updated_by},#{updated_on},#{delete_flag})")
    void addThird(AlertThirdModel alertThirdModel);
}
