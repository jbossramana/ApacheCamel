package demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("msg")
	public String getMsg()
	{
		return "Spring Sample Rest Service";
	}
}
