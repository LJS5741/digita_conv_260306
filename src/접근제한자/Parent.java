package 접근제한자;

public class Parent {
    String name;
    String address;
     int money;
     public Parent() {
         name = "부자 아빠";
         address = "서울시 강남구 청담동";
         money = 100000000;  // 10억
     }
     public String getName() {
         return name;
     }
    public String getAddress() {
        return address;
    }
    public int getMoney() {
        return money;
    }

}
