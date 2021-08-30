package com.greatlearning.designpatter1;
import java.sql.SQLException;
import java.util.List;
  
import com.greatlearning.designpatter1.Employee;

public interface EmployeeDao {

    public int add(Employee emp)
        throws SQLException;
    public void delete(int id)
        throws SQLException;
    public Employee getEmployee(int id)
        throws SQLException;
    public List<Employee> getEmployees()
        throws SQLException;
    public void update(Employee emp)
        throws SQLException;

}
