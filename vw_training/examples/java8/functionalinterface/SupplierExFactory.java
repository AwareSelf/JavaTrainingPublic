package functionalinterface;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.math.BigDecimal;

public class SupplierExFactory {
    
    public static void main(String[] args) {
        Employee e = factory(Employee::new);
        System.out.println(e);

        Employee e1 = factory(()->new Employee("namrata"));
        System.out.println(e1);

    }

  public static Employee factory(Supplier<? extends Employee> s) {

    Employee emp = s.get();
    if (emp.getName() == null || "".equals(emp.getName())) {
        emp.setName("default");
    }
    emp.setSalary(BigDecimal.TEN);
    emp.setJoin(LocalDate.of(2022, 3, 4));

    return emp;

  }

}

class Employee {

String name;
BigDecimal salary;
LocalDate join;

// for factory(Developer::new);
public Employee() {
}

// for factory(() -> new Employee("namrata"));
public Employee(String name) {
    this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public BigDecimal getSalary() {
	return salary;
}

public void setSalary(BigDecimal salary) {
	this.salary = salary;
}

public LocalDate getJoin() {
	return join;
}

public void setJoin(LocalDate join) {
	this.join = join;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", join=" + join + "]";
}

}
