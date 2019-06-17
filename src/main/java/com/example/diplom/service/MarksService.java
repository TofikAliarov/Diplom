package com.example.diplom.service;

import com.example.diplom.dal.api.MarksDao;
import com.example.diplom.dal.api.StudentDao;
import com.example.diplom.entity.MarksEntity;
import com.example.diplom.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    StudentDao studentDao;

    @Autowired
    MarksDao marksDao;

    public void generateMarksForAllStudentsInGroup(final MarksEntity mark) {
        final int studentId = mark.getStudentId();
        final StudentEntity student = studentDao.findById(studentId).get();
        final int groupId = student.getGroupId();

        final List<StudentEntity> studentsInGroup = studentDao.getStudentsGroup(groupId);

        studentsInGroup.remove(student);

        studentsInGroup.stream()
                .map(studentEntity -> student.getId())
                .forEach(id -> {
                    mark.setStudentId(id);
                    mark.setMark(0);
                    marksDao.save(mark);
                });

    }
}
