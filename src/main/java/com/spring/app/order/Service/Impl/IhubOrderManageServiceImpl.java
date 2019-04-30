package com.spring.app.order.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.order.Service.IIhubOrderManageService;
import com.spring.app.order.dao.IIhubOrderDao;
import com.spring.app.order.vo.IhubOrderVO;

@Service
public class IhubOrderManageServiceImpl implements IIhubOrderManageService{
	
	@Autowired
	private IIhubOrderDao iihuborderDao;

	@Override
	public IhubOrderVO findorderByuserId(String userId) {
		// TODO Auto-generated method stub
		IhubOrderVO vo = iihuborderDao.findorderByuserId(userId);
		return vo;
	}

}
