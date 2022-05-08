package com.example.demo.controllers;

import com.example.demo.services.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.example.demo.controllers
 * fileName        : TestController
 * author           : 최민서
 * date               : 2022-05-06
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-06         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService service;
}
