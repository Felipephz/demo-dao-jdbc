package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); // insert in SQL the object that you send
	void update(Seller obj); // update in SQL the object that you send
	void deleteById(Integer id); // delete a data by his id
	Seller findById(Integer id); // consult the id that you send and return the id or return null (if the id doesn't exists)
	List<Seller> findAll(); // return all the sellers 
	List<Seller> findByDepartment (Department department); // consult the department that you send and return all the workers from it
	
}
