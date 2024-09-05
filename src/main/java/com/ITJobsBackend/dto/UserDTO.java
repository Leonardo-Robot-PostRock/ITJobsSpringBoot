package com.ITJobsBackend.dto;

public class UserDTO {
	private String name;
	private String surname;
	private String dni;
	private String email;
	private String phone;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}

	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}

	public static class UserDTOBuilder {
		private String name;
		private String surname;
		private String dni;
		private String email;
		private String phone;
		private UserDTO userDTO;

		public UserDTOBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public UserDTOBuilder withSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public UserDTOBuilder withDNI(String dni) {
			this.dni = dni;
			return this;
		}

		public UserDTOBuilder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserDTOBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(name);
			userDTO.setSurname(surname);
			userDTO.setDni(dni);
			userDTO.setEmail(email);
			userDTO.setPhone(phone);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
