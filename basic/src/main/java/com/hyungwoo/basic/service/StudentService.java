package com.hyungwoo.basic.service;

import org.springframework.http.ResponseEntity;

import com.hyungwoo.basic.dto.request.student.PatchStudentRequestDto;
import com.hyungwoo.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
    ResponseEntity<String> patchStudent(PatchStudentRequestDto dto);
    ResponseEntity<String> deleteStudent(Integer studentNumber);
}
