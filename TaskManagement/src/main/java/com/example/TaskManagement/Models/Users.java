package com.example.TaskManagement.Models;

import com.example.TaskManagement.Enums.RoleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users",uniqueConstraints = {
          @UniqueConstraint(columnNames = {"email"})
})
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="name",nullable = false)//db level validation
	private String name;
	@Column(name="email",nullable = false)
	private String email;
	@Column(name="password",nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private RoleType role;
}
