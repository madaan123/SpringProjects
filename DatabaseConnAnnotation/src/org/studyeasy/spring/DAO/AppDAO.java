package org.studyeasy.spring.DAO;

import java.util.List;

import org.studyeasy.spring.model.User_DB;

public interface AppDAO {

	public List<User_DB> listUsers();
}
