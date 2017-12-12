package com.pi.ms.config.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ms.common.TaskConversion;
import com.pi.ms.config.bean.TaskBean;
import com.pi.ms.config.dao.TaskDao;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
	private Logger logger = Logger.getLogger(TaskServiceImpl.class);
	@Autowired
	private TaskDao taskDao;

	@Override
	public void createtask(TaskBean task) {
		logger.info("task creating inprogress>>id >."+task.getTaskId());
		taskDao.createtask(new TaskConversion().convertingBeanToModel(task));
	}

	@Override
	public void updateTask(TaskBean task) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTask(TaskBean task) {
		// TODO Auto-generated method stub

	}

	@Override
	public TaskBean getTaskByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

}
