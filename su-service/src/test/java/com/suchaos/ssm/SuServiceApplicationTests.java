package com.suchaos.ssm;

import com.suchaos.ssm.model.Students;
import com.suchaos.ssm.service.StudentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuServiceApplicationTests {

    @Autowired
    private StudentsService studentsService;

    @Test
    public void testFindById() {
        Students student = studentsService.getStudentBtId(1L);
        System.out.println(student.getName());
    }

    @Test
    public void testGetStudentList() {
        String list = studentsService.getStudentList(1, 3);
        System.out.println(list);
    }

}

