package com.study.rest.controller;

import com.study.rest.dto.ReqStudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// REST API (view를 리턴하는게 아님)
@Slf4j // log 사용
@RestController  // 데이터만 요청하고 데이터만 받음 view응답이 없다(오로지 데이터 응답만 있음), @ResponseBody가 자동으로 적용
public class BasicController {

    @CrossOrigin
    @PostMapping("/basic/student")   // 계층형, 가능한 동사 안넣음 / crud의 동작은 무조건 메소드로 : postMapping은 추가 = 학생을 추가
    public ResponseEntity<?> basicPost(@RequestBody ReqStudentDto reqStudentDto) {
        log.info("Student: {}", reqStudentDto);  // {} 안에 reqStudentDto가 들어감
        return ResponseEntity.badRequest().body(null); // ok -> 상태코드 200, badRequest -> 상태코드 400
    }
}

