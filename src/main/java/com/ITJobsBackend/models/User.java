package com.ITJobsBackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column
	private String password;


}
