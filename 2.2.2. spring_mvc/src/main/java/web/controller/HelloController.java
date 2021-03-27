package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value="/cars")
	public String getCar(@RequestParam(value = "count",required = false) int count, ModelMap model){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(313,1,"Lada"));
		cars.add(new Car(41,2,"Ford"));
		cars.add(new Car(3123,3,"Nissan"));
		cars.add(new Car(3432,4,"Infinity"));
		cars.add(new Car(4313,5,"Lexus"));
		List<Car> result = new ArrayList<>();
		if(count>0 && count<6) {
			for (int i = 0; i < count; i++) {
				result.add(cars.get(i));
			}
			model.addAttribute("result", result);
		}
		else
			model.addAttribute("result", cars);
		return "cars";
	}
}