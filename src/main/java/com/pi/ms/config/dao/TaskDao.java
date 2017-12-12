package com.pi.ms.config.dao;

import com.pi.ms.config.model.TaskModel;

public interface TaskDao {
	public void createtask(TaskModel task);

	public void updateTask(TaskModel task);

	public void deleteTask(TaskModel task);

	public TaskModel getTaskByTaskId(String taskId);
}
