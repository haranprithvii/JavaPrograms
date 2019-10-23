import java.io.IOException;
import java.util.List;
import java.util.*;

public class Hierarchy {
    Map<Integer, Employee> employees;
    List<Employee> topEmployee;
    class Employee {
        int id;
        int mgrId;
        String empName;
        List<Employee> subordinates;
        public Employee(int id, int managerId, String empName) {
            try {
                this.id = id;
                this.mgrId = managerId;
                this.empName = empName;
            } catch (Exception e) {
                System.out.println("Unable to create Employee as the data is " + id + " " + managerId + " " + empName);
            }
        }

        List<Employee> getSubordinates() {
            return subordinates;
        }
        void setSubordinates(List<Employee> subordinates) {
            this.subordinates = subordinates;
        }
        int getId() {
            return id;
        }

        void setId(int id) {
            this.id = id;
        }

        int getMgrId() {
            return mgrId;
        }

    }

    public static void main(String[] args) throws IOException {
        Hierarchy thisClass = new Hierarchy();
        thisClass.process();
    }

    private void process() throws IOException {
        employees = new HashMap<Integer, Employee>();
        topEmployee = new ArrayList<>();
        readDataAndCreateEmployees();
        buildHierarchy(topEmployee);
        printSubOrdinates(topEmployee, tabLevel);
    }

    private void readDataAndCreateEmployees() throws IOException {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(1, 0, "Manager1"));
        emp.add(new Employee(2, 1, "SubO1"));
        emp.add(new Employee(3, 2, "SubO2"));
        emp.add(new Employee(4, 3, "SubO3"));
        emp.add(new Employee(5, 0, "Manager2"));
        emp.add(new Employee(6, 5, "SubO4"));
        emp.add(new Employee(7, 5, "SubO5"));
        for (Employee e : emp) {
            Employee employee = createEmployee(e);
            employees.put(employee.getId(), employee);
            if (employee.getMgrId() == 0) {
                topEmployee.add(employee);
            }
        }
    }

    int tabLevel = 0;

    private void printSubOrdinates(List<Employee> topEmployee, int tabLevel) {
        for (int i = 0; i < tabLevel; i++) {
            System.out.print("\t");
        }
        for (Employee emp: topEmployee) {
            System.out.println("-" + emp.empName);
            List<Employee> subordinates = emp.getSubordinates();
            System.out.print(" ");
            for (Employee sub : subordinates) {
                List<Employee> subOrdinate = new ArrayList<>();
                subOrdinate.add(sub);
                printSubOrdinates(subOrdinate, tabLevel + 1);
            }
        }
    }
    public List<Employee> findAllEmployeesByMgrId(int mgrid) {
        List<Employee> sameMgrEmployees = new ArrayList<Employee>();
        for (Employee e : employees.values()) {
            if (e.getMgrId() == mgrid) {
                sameMgrEmployees.add(e);
            }
        }
        return sameMgrEmployees;
    }

    private void buildHierarchy(List<Employee> topEmployee) {
        for(Employee e: topEmployee) {
            Employee employee = e;
            List<Employee> employees1 = findAllEmployeesByMgrId(e.getId());
            employee.setSubordinates(employees1);
            if (employees1.size() == 0) {
                return;
            }

        for (Employee e1 : employees1) {
            List<Employee> list = new ArrayList<Employee>();
            list.add(e1);
            buildHierarchy(list);
        }
    }
    }

    private Employee createEmployee(Employee emp) {
        Employee employee = null;
        try {
            if (emp != null) {
                employee = new Employee(emp.id, emp.mgrId, emp.empName);
            }
        } catch (Exception e) {
            System.out.println("Unable to create Employee as the data is " + emp.toString());
        }
        return employee;
    }
}

