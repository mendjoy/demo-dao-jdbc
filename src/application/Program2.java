package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n === TESTE 4: department findAll ===");
		 List<Department> list = departmentDao.findAll();
		    for (Department obj : list) {
		    	System.out.println(obj);
		    }
		
		System.out.println("=== TESTE 1: department insert ===");
		Department newDep = new Department(null, "Shoes");
		//departmentDao.insert(newDep);
		System.out.println("Inserted: " + newDep.getId());
		
		System.out.println("\n === TESTE 2: department update ===");
		Department dep = departmentDao.findById(3);
		dep.setName("Hats");	
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n === TESTE 3: department delete ===");
		System.out.print("Informe um id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete");
		
         sc.close();
		

	}

}
