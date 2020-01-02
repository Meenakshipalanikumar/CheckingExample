package com.example.mailprocess.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;



@Service
public class NotificationService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	
	
	public void sendNotificaitoin() throws MailException, InterruptedException {
		
		System.out.println("Sleeping now...");
        Thread.sleep(10000);
		
        System.out.println("Sending email...");
        
        SimpleMailMessage mail = new SimpleMailMessage();
       // MimeMessage h = javaMailSender.createMimeMessage();
        try {
			//MimeMessageHelper h1=new MimeMessageHelper(h,true);
		mail.setTo("meenakship20101998@gmail.com");
        System.out.println("preparing email...");
		//h1.setTo("meenakship20101998@gmail.com");
        mail.setSubject("Hellloooo");
        mail.setText("Helllllooooo haiiiiiii");
		System.out.println("preparing email  receiver...");
		
		//h1.setSubject("Spring Boot is awesome!");
		//h1.setText("Why aren't you using Spring Boot?");
		System.out.println("prepared msg...");
		//FileSystemResource file = new FileSystemResource(new File("/home/sys-user/Downloads/7d290c56855e683e7ec685448e09da9b.jpg"));
		
	   // h1.addAttachment("report",file);
		
		javaMailSender.send(mail);
		
		System.out.println("Email Sent!");
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

