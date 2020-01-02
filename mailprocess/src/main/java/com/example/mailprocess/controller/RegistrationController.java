package com.example.mailprocess.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailprocess.service.NotificationService;


@RestController
public class RegistrationController {
	
	
		
		private Logger logger = LoggerFactory.getLogger(RegistrationController.class);
		
		@Autowired(required=true)
		private NotificationService notificationService;
		
		@RequestMapping("/signup-success")
		public String signupSuccess(){
			
			try {
				notificationService.sendNotificaitoin();
			}catch( Exception e ){
				// catch error
				System.out.println("erorrrr");
			}
			
			return "Thank you for registering with us.";
		}

}
