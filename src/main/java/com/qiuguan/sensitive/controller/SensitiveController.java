package com.qiuguan.sensitive.controller;

import com.qiuguan.springbootai.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fu yuan hui
 * @since 2024-07-25 00:05:25 Thursday
 */
@RestController
public class SensitiveController {

    @GetMapping("/test")
    public Student test() {
        Student student = new Student();
        student.setId(10001L);
        student.setPhone("18368116334");
        student.setPassword("123456");

        return student;
    }
}
