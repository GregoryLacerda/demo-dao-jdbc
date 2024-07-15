package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

		
		System.out.println("\n=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		

		System.out.println("\n=== TEST 2: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: Department Update ===");
		department = departmentDao.findById(7);
		department.setName("Clothes");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		
		System.out.println("\n=== TEST 4: Department Update ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Id "+ id +" deleted!");
		sc.close();
		
		
		System.out.println("\n=== TEST 5: Department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		
		for (Department dep : list) {
			System.out.println(dep);
		}
		
	}

}
