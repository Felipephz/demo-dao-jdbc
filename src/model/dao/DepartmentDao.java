package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); // insert in SQL the object that you send
	void update(Department obj); // update in SQL the object that you send
	void deleteById(Integer id); // delete a data by his id
	Department findById(Integer id); // consult the id that you send and return the id or return null (if the id doesn't exists)
	List<Department> findAll(); // return all the departments
	
}
