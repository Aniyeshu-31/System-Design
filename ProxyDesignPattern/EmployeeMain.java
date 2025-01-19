public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        try {
            EmployeeTableDao obj = new EmployeeProxyDao();
            obj.createEmployee("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
