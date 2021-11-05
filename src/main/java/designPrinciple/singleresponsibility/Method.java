package designPrinciple.singleresponsibility;

// 方法级别的单一职责
public class Method {
    public void updateUserInfo(String name, String address, boolean bool) {
        if(bool) {
            //todo something1
        } else {
            //todo something2
        }
        name = "helisi";
        address = "benxi";
    }

//  拆分
    public void updateUsername(String name) {
        name = "helisi";
    }
    public void updateUserAddress(String address) {
        address = "benxi";
    }
}
