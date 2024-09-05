package com.ITJobsBackend.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@NotBlank
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String surname;

	@NotNull
	@Column(nullable = false, unique = true)
	private String dni;

	@NotBlank
	@Email
	@Column
	private String email;

	@Column
	private String phone;

	@NotNull
	@Column(nullable = false)
	@Size(min = 8)
	private String password;
}
