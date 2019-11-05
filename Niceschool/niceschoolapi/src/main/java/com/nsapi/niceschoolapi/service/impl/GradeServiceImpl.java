package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.TchExamDB;
import com.nsapi.niceschoolapi.entity.TeacherDB;
import com.nsapi.niceschoolapi.mapper.GradeMapper;
import com.nsapi.niceschoolapi.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;

    //  查询学生个人信息
    @Override
    public List<Map> selStudentMessage(Integer sid) {
        return gradeMapper.selStudentMessage(sid);
    }

    //  查询学生成绩信息
    @Override
    public List<Map> selGrade(Integer sid, Integer stime) {
        Map<String,Object> map = new HashMap<>();
        map.put("stime",stime);
        map.put("sid",sid);
        return gradeMapper.selGrade(map);
    }

    //  管理员详情页面查询教师教评成绩
    @Override
    public List<TchExamDB> selTeaExam(Integer tid) {
        return gradeMapper.selTeaExam(tid);
    }

    //  查询教师个人信息
    @Override
    public List<TeacherDB> selTea(Integer tid) {
        return gradeMapper.selTea(tid);
    }
}