package com.spring.app.order.dao;

import com.spring.app.order.vo.IhubOrderVO;

public interface IIhubOrderDao {

	IhubOrderVO findorderByuserId(String userId);

}
