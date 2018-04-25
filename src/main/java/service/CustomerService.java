package service;

import java.security.NoSuchAlgorithmException;

import exception.AuthenticationFailedException;
import model.Customer;

public interface CustomerService {

	Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException;
	Long addCustomer(Customer customer) throws NoSuchAlgorithmException;
}
