package com.Alpha.InventryManagementSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_id;
	private String category_name;
	private  String category_describtion;
	
	private int parentCategory_id;
	
	@ManyToOne
	@JoinColumn(name = "created_By")
	private User createdBy;
	
	@ManyToOne
	@JoinColumn(name = "parent_category_id")
	private Category parentCategoryId;
}
