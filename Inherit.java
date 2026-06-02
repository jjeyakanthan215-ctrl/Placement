class User {
    String name;
    String phone;
    String location;
        User(String name, String phone, String location){
        this.name = name;
        this.phone = phone;
        this.location = location;
    }
    public void basicInfo(){
        System.out.println("name: " + name + ", phone: " + phone + ", location: " + location);
    }
}
class FoodUser extends User{
        String favFood;
        FoodUser(String name, String phone, String location, String favFood){
            super(name, phone, location);
            this.favFood = favFood;
        }
        public void userDetails(){
            basicInfo();
            System.out.println("Favorite Food : " + favFood);
        }
}
public class Inherit{
    public static void main(String[] args) {
        FoodUser user1=new FoodUser("foodie","1234567899","chennai","curdrice");
    user1.userDetails();
    }

}
