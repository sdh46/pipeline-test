package com.example.pipelinetest.hello;

import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String getHello(@RequestParam(required = false) String name) {
		String hello = "안녕하세요.";
		if (Objects.nonNull(name)) {
			hello = name + "님 " + hello;
		}
		return hello;
	}
}
