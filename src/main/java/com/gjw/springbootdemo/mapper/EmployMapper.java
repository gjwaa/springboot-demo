package com.gjw.springbootdemo.mapper;

import com.gjw.springbootdemo.bean.Department;
import com.gjw.springbootdemo.bean.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployMapper {

    private static Map<Integer, Employ> employMap = new HashMap<>();

    @Autowired
    private DepartmentMapper departmentMapper;


    static {
        employMap.put(1001, new Employ(1001, "AA", "AA@qq.com", 0, new Department(101, "教学部")));
        employMap.put(1002, new Employ(1002, "BB", "BB@qq.com", 1, new Department(102, "市场部")));
        employMap.put(1003, new Employ(1003, "CC", "CC@qq.com", 0, new Department(103, "后勤部")));
        employMap.put(1004, new Employ(1004, "DD", "DD@qq.com", 1, new Department(104, "运营部")));

    }

    private static Integer initID = 1006;

    public void add(Employ employ) {
        if (employ.getEID() == null) employ.setEID(initID++);
        System.out.println((employ.getEID()+"==="+initID));
        employ.setDepartment(departmentMapper.getDeptByID(employ.getDepartment().getDID()));
        employMap.put(employ.getEID(), employ);
    }

    public Collection<Employ> getAll() {
        return employMap.values();
    }

    public Employ getEmployByID(Integer id) {
        return employMap.get(id);
    }

    public void deleteByID(Integer id) {
        employMap.remove(id);

    }


}
