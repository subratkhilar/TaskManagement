package com.pi.ms.config.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pi.ms.common.ResponseMessage;
import com.pi.ms.config.bean.Producer;
import com.pi.ms.config.bean.TaskBean;
import com.pi.ms.config.service.TaskService;

@RestController
public class TaskController {
	private Logger logger = Logger.getLogger(TaskController.class);
	@Autowired
	private TaskService taskService;
	private String message;
	@Autowired
	Producer producer;

	@RequestMapping(value = "/createTask", method = RequestMethod.POST)
	public ResponseEntity<ResponseMessage> addTask(@RequestBody TaskBean task) {
		ResponseMessage response = new ResponseMessage();
		logger.info("[" + task.getTaskId() + " ..]");
		try {
			taskService.createtask(task);
			message = "Task Created sucessfully!!";
			response.setMessage(message);
			logger.info("[" + message + " ..]");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			message = "Error in Task Creation";
			logger.info("[" + message + " ..]");
			e.printStackTrace();
			return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
		}finally{
			producer.produceMsg(task.getTaskId()+" "+message);
		}

	}

	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public ResponseEntity<List<TaskBean>> taskLists() {
		logger.info("[tasklist >>  ..]");
		return null;
	}
}
