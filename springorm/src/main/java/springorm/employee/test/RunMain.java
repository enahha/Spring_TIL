package springorm.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springorm.employee.dao.EmployeeDao;
import springorm.employee.entity.Employee;

public class RunMain {

	private static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = 
			new ClassPathXmlApplicationContext(
				"classpath:/springorm/employee/test/config.xml");
		
		EmployeeDao employeeDao = 
				(EmployeeDao)ctx.getBean("employeedao");
		
		System.out.println(ctx.getBean("hibernateTemplate"));
		
		//insert
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("박");
//		int result = employeeDao.create(employee);
//		System.out.println(result);
		
		// update
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("홍");
//		employeeDao.update(employee);
		
		// delete
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("홍");
//		employeeDao.delete(employee);
		
		// select
//		Employee employee= employeeDao.find(1);
//		System.out.println(employee);
		
		// select and paint list
//		List<Employee> employeeList 
//			= employeeDao.findAll();
//		System.out.println(employeeList);
		
		ctx.close();
	}

}
