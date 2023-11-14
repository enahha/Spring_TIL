package springmcv_uifoctrol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmcv_uifoctrol.dto.Order;

@Controller
public class OrderControllerModel {

	@RequestMapping("/orderPage3")
	public String orderPage() {		
		return "order1";
	}
	
	@RequestMapping("/showOrder1")
	public String showOrder(
			@ModelAttribute("order") Order order,
			ModelMap model) {
		
		// 데이터 지정
		model.addAttribute("order", order);

		return "showOrder";
	}
}
