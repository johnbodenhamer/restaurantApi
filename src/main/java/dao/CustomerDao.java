package dao;

import model.Customer;

public interface CustomerDao {

	Customer findBy(String username);

	Long save(Customer customer);

}