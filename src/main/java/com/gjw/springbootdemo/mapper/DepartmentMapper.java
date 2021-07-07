package com.gjw.springbootdemo.mapper;

import com.gjw.springbootdemo.bean.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentMapper {

    private static Map<Integer, Department> departmentMap = new HashMap<>();

    static {
        departmentMap.put(101, new Department(101, "教学部"));
        departmentMap.put(102, new Department(102, "市场部"));
        departmentMap.put(103, new Department(103, "后勤部"));
        departmentMap.put(104, new Department(104, "运营部"));

    }

    public Collection<Department> getAllDept(){
        return departmentMap.values();
    }

    public Department getDeptByID(Integer id){
        return departmentMap.get(id);
    }


}
