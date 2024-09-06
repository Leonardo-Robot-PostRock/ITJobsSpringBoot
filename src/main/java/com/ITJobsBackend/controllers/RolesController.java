package com.ITJobsBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ITJobsBackend.dto.RolesDTO;
import com.ITJobsBackend.services.RolesService;

@RestController
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @GetMapping("api/roles")
    public List<RolesDTO> getAllRoles() {
        return rolesService.getAllRoles();
    }

    @GetMapping("id/{id}")
    public RolesDTO getRoleById(@PathVariable Integer id) {
        return rolesService.getRoleById(id);
    }
}
