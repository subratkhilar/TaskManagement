package com.pi.ms.common;

import org.apache.log4j.Logger;

import com.pi.ms.config.bean.TaskBean;
import com.pi.ms.config.model.TaskModel;

public class TaskConversion {
	Logger logger = Logger.getLogger(TaskConversion.class);

	public TaskModel convertingModelToBean() {
		return null;
	}

	public TaskModel convertingBeanToModel(TaskBean taskBean) {
		logger.info("[taskBean.getTaskId()]"+taskBean.getTaskId());
		TaskModel model = new TaskModel();
		model.setTaskId(taskBean.getTaskId());
		model.setTaskName(taskBean.getTaskName());
		model.setDescription(taskBean.getDescription());
		model.setTaskStartDate(taskBean.getTaskStartDate());
		model.setTaskEndDate(taskBean.getTaskEndDate());
		model.setTaskPriority(taskBean.getTaskPriority());
		return model;
	}
}
