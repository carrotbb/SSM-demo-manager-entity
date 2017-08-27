package com.fohow.service.impl;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fohow.entity.QuartzConfigure;
import com.fohow.service.DemoService;
import com.fohow.util.PagedResult;
import com.fohow.util.UUIDGenerator;
@RunWith(SpringJUnit4ClassRunner.class)
//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration({ "classpath:spring-mapper.xml",
"classpath:spring-service.xml" })
public class DemoServiceImplTest {
	
	@Autowired
	DemoService  demoServiceImpl;

	@Test
	public void testAdd() throws Exception {
		QuartzConfigure quartzConfigure=new QuartzConfigure();
		quartzConfigure.setClassPath("1234");
		quartzConfigure.setCreateId("00000");
		quartzConfigure.setUpdateId("00000");
		quartzConfigure.setCronExpression("123");
		quartzConfigure.setTaskName("luojian");
		quartzConfigure.setId(UUIDGenerator.getUUID());
		quartzConfigure.setUpdateTime(new Date());
		quartzConfigure.setCreateTime(new Date());
		demoServiceImpl.add(quartzConfigure);
	}

	@Test
	public void testGetPage() throws Exception {
		PagedResult<QuartzConfigure> page=demoServiceImpl.getPage(1, 1, null);
		System.out.println(page);
	}

	@Test
	public void testUpdate() throws Exception {
		String id="d86dc9c22d874244ac472163e68cd0da";
		QuartzConfigure  qc=demoServiceImpl.find(id);
		qc.setUpdateTime(new Date());
		qc.setUpdateId("11111");
		demoServiceImpl.update(qc);
	}

}
