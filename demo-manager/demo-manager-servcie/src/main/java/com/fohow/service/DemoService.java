package com.fohow.service;

import com.fohow.entity.QuartzConfigure;
import com.fohow.util.PagedResult;

public interface DemoService {
	
    public void add(QuartzConfigure quartzConfigure) throws Exception;
	
    public PagedResult<QuartzConfigure> getPage(Integer pageNo, Integer pageSize,String taskName) throws Exception;
	
	public void update(QuartzConfigure quartzConfigure) throws Exception;
	
	public QuartzConfigure find(String id) throws Exception;
	
}
