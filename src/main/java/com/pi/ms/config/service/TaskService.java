package com.pi.ms.config.service;

import com.pi.ms.config.bean.TaskBean;

public interface TaskService {
	public void createtask(TaskBean task);

	public void updateTask(TaskBean task);

	public void deleteTask(TaskBean task);

	public TaskBean getTaskByTaskId(String taskId);
}
