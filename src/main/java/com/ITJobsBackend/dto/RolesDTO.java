package com.ITJobsBackend.dto;

public class RolesDTO {
	private int id;
	private String name;
	private String description;

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

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
		private int id;
		private String name;
		private String description;
		private RolesDTO rolesDTO;
		
		public RolesDTOBuilder withId(int id) {
			this.id = id;
			return this;
		}

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
			rolesDTO.setId(id);
			rolesDTO.setName(name);
			rolesDTO.setDescription(description);
			return rolesDTO;
		}

		public RolesDTO getRolesDTO() {
			return this.rolesDTO;
		}
	}
}
