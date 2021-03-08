package com.yanj.edu.controller;


import com.yanj.edu.entity.Teacher;
import com.yanj.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-03-03
 */
@RestController
@RequestMapping("/edu/teacher")
@CrossOrigin
@Api("讲师管理")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("所有讲师列表")
    @GetMapping(path = "/findAll")
    public List<Teacher> list(){
        List<Teacher> teachers=teacherService.list(null);
        return teachers;
    }

    @ApiOperation("根据id删除讲师")
    @DeleteMapping("{id}")
    public boolean removeId(@ApiParam(name = "id", value = "讲师ID", required = true) @PathVariable String id){
        return teacherService.removeById(id);
    }




}

