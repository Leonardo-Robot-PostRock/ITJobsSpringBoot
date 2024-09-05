package com.ITJobsBackend.dto;

public class RolesDTO {
	private String name;
	private String description;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public static RolesDTOBuilder builder() {
		return new RolesDTOBuilder();
	}

	public static class RolesDTOBuilder {
		private String name;
		private String description;
		private RolesDTO rolesDTO;

		public RolesDTOBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public RolesDTOBuilder withDescription(String description) {
			this.description = description;
			return this;
		}

		public RolesDTO build() {
			this.rolesDTO = new RolesDTO();
			rolesDTO.setName(name);
			rolesDTO.setDescription(description);
			return rolesDTO;
		}

		public RolesDTO getRolesDTO() {
			return this.rolesDTO;
		}
	}
}
