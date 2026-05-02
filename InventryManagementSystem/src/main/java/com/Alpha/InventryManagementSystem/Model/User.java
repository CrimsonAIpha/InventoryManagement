package com.Alpha.InventryManagementSystem.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class User 
{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int userId;
		private String userName ;
		private String userEmail;
		private String userPass;
		@Enumerated(EnumType.STRING)
		private Role role ;
		private boolean isActive;
		private LocalDateTime createdAt;
}
