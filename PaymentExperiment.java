package gitHubCode.PaymentApplicationV_001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentExperiment {
	@GetMapping(value="/hh")
	public String aaa() {
		return "hi";
	}
}
