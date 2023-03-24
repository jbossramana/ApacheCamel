package demo.camel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("msg")
	public String getMsg()
	{
		return "Sprint External Rest Service";
	}
}
