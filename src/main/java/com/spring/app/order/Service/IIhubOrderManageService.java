package com.spring.app.order.Service;

import com.spring.app.order.vo.IhubOrderVO;

public interface IIhubOrderManageService {

	IhubOrderVO findorderByuserId(String userId);

}
