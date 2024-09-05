package com.ITJobsBackend.dto;

public interface UserDTOBuilder {
	UserDTOBuilder withName(String name);

	UserDTOBuilder withSurname(String name);

	UserDTOBuilder withDNI(String dni);

	UserDTOBuilder withPhone(String name);

	UserDTOBuilder withEmail(String email);

	UserDTO build();

	UserDTO getUserDTO();
}
