public class Main {
    public static void main(String[] av) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        customer.id = 1;
        customer.firstName = "selahattin";
        customer.lastName = "gungor";
        customer.age = 22;
        customer.email = "selahattin_gungor53@hotmail.com";
        customerManager.Add();

        employee.id = 1;
        employee.firstName = "asude";
        employee.lastName = "turk";
        employee.age = 25;
        employee.salary = 33995;
        employeeManager.Add();
        /*
         * employee ve customer classlari kendi icerlerinde
         * tanimli olmamalarina ragmen name, id, age gibi
         * degiskenler alabildiler
         * bunlari person class'indan inheritance(miras)
         * alarak gerceklestirdik
         */
    }
}