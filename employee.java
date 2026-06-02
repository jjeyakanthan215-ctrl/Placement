class employee {
    String employeeName;
    int employeeId;
    public void display(){
        System.out.println("employeeName: " + employeeName + ", employeeId: " + employeeId);
    }   
    public class obj {}
    public static void main(String[] args){
        employee e1 = new employee();
        e1.employeeName = "tom";
        e1.employeeId = 123;
        e1.display();
    }
    
}
