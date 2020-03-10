package com.sm.ugb.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.UsersList;

@RestController
@RequestMapping("/u-list")
public class UserListController {
	
	@Autowired
	private UserList userListCtrl ;
}
