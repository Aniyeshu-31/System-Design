public class EmployeeDaoImplementation implements EmployeeTableDao {
        @Override
        public void createEmployee(String client, EmployeeDo obj) throws Exception {
            // TODO Auto-generated method stub
            System.out.println("Creating a New Employee");
        }
        @Override
        public void deleteEmployee(String client, int EmployeeId) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Deleting the Employee with Id: "+EmployeeId);
        }
        @Override
        public EmployeeDo getEmployee(String client, int EmployeeId) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Fetching the Data from the Database");
        return new EmployeeDo();
        }
}
