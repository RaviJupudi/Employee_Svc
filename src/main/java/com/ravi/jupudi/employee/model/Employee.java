package com.ravi.jupudi.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Ravi Jupudi
 *
 */

@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 4910225916550731446L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "manager_name", length = 50)
	private String manager_name;

	@Column(name = "dept", length = 20)
	private String dept;

	@Column(name = "salary")
	private Integer salary;

	public Employee() {
	}

	public Employee(Long id) {
		this.id = id;
	}

	public Employee(Long id, String name, String manager_name, String dept, Integer salary) {
		this.id = id;
		this.name = name;
		this.manager_name = manager_name;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee(String name, String manager_name, String dept, Integer salary) {
		this.name = name;
		this.manager_name = manager_name;
		this.dept = dept;
		this.salary = salary;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Id: ").append(this.id).append(", name: ").append(this.name).append(", lastName: ")
				.append(this.manager_name).append(", Department: ").append(this.dept).append(", Salary: ")
				.append(this.salary);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (id == null || obj == null || getClass() != obj.getClass())
			return false;
		Employee toCompare = (Employee) obj;
		return id.equals(toCompare.id);
	}

	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}

}
