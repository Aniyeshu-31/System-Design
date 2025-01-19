public class EmployeeProxyDao implements EmployeeTableDao{
    EmployeeTableDao employeeObj;
    EmployeeProxyDao() {
        employeeObj = new EmployeeDaoImplementation();
    }
    @Override
    public void createEmployee(String client, EmployeeDo obj) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN")){
            employeeObj.createEmployee(client,obj);
        }
        else throw new Exception("Access Denied");
    }
    @Override
    public void deleteEmployee(String client, int EmployeeId) throws Exception {
        // TODO Auto-generated method stub

         if(client.equals("ADMIN")){
            employeeObj.deleteEmployee(client,EmployeeId);
        }
            else    throw new Exception("Access Denied");
    }
    @Override
    public EmployeeDo getEmployee(String client, int EmployeeId) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeObj.getEmployee(client,EmployeeId);
        }
        else throw new Exception("Access Denied");
    }
}
