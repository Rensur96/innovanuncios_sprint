package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.UsersList;
import com.sm.ugb.models.services.UserListService;

@RestController
@RequestMapping("/users")
public class UserListController {
	
	@Autowired
	private UserListService userListCtrl;
		
	@RequestMapping(value="/u-list", method = RequestMethod.GET)
	public List<UsersList> getList(){
		return (List<UsersList>) userListCtrl.findAll();
	}
	
	@RequestMapping(value="/u-list/{id}", method = RequestMethod.GET)
	public UsersList getById(@PathVariable("id") Long id){
		Optional<UsersList> result =  userListCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(value="/u-list", method = RequestMethod.POST)
	public UsersList saveUser(@RequestBody UsersList entity){
		return (UsersList) userListCtrl.save(entity);
	}
	
	@RequestMapping(value="/u-list/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		userListCtrl.delete(id);
	}
}
