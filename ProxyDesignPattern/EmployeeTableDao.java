import java.util.*;
public interface EmployeeTableDao {
    public void createEmployee(String client, EmployeeDo obj) throws Exception;
    public void deleteEmployee(String client , int EmployeeId) throws Exception;
    public EmployeeDo getEmployee(String client,int EmployeeId) throws Exception;
}