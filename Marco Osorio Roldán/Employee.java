import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private float salary;
    
    public Employee(String name) {
        this.id = new Random().nextInt(1000);
        this.name = name;
        this.phone = "011223344";
        this.salary = 999.0f;
    }
    
    public Employee(int id, String name, String phone, float salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public float getSalary() {
        return salary;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    // toString
    @Override
    public String toString() {
        return id + "," + name + "," + phone + "," + salary;
    }
}
