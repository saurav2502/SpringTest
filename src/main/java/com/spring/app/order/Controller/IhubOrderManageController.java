package com.spring.app.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.order.Service.IIhubOrderManageService;
import com.spring.app.order.vo.IhubOrderVO;

@RestController
@RequestMapping("/")
public class IhubOrderManageController {
	
	@Autowired
	private IIhubOrderManageService ihubOrderManageService;
	
	@GetMapping("/order/{userId}")
	public IhubOrderVO findorderByuserId(@PathVariable("userId") String userId) {
		IhubOrderVO orderVO = new IhubOrderVO();
		try {
			orderVO = ihubOrderManageService.findorderByuserId(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderVO;
		
	}
}
