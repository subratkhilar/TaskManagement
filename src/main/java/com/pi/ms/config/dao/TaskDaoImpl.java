package com.pi.ms.config.dao;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import com.pi.ms.config.model.TaskModel;
@Transactional
@Repository("taskDao")
public class TaskDaoImpl implements TaskDao {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public void createtask(TaskModel task) {
		entityManager.persist(task);
		/*Properties properties = new Properties();
		properties.setProperty("timeZone", databaseTimeZone);
		query.setParameter("from", dateEnteredByUser, Hibernate.custom(LocalizedDateType.class, properties));*/

	}

	@Override
	public void updateTask(TaskModel task) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTask(TaskModel task) {
		// TODO Auto-generated method stub

	}

	@Override
	public TaskModel getTaskByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

}
