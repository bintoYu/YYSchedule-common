package com.YYSchedule.common.pojo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TaskPoolPojo
{
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskPoolPojo.class);
	
	private static final int[] nums = {9,6,4,2,0};
	
	//记录池中任务总数量
	private AtomicInteger poolSize = new AtomicInteger(0);		

	//记录池中每个优先级队列的容量
	private Map<Integer,AtomicInteger> queueSizeMap = new ConcurrentHashMap<>();

	public AtomicInteger getPoolSize()
	{
		return poolSize;
	}

	public void setPoolSize(AtomicInteger poolSize)
	{
		this.poolSize = poolSize;
	}

	public Map<Integer, AtomicInteger> getQueueSizeMap()
	{
		return queueSizeMap;
	}

	public void setQueueSizeMap(Map<Integer, AtomicInteger> queueSizeMap)
	{
		this.queueSizeMap = queueSizeMap;
	}
	
	
}
