import java.util.Map;
import java.util.HashMap;

public class Address {
    private Map<String, String> addressMap;

    public Address() {
    public Address() {  // 생성자 : Address 객체를 생성할 때 내부 Map을 초기화
        addressMap = new HashMap<>();
    }

    public void addAddress(String name, String address) {   // 주소 추가
        addressMap.put(name, address);
    }

    public String getAddress(String name) { // 주소 조회
        return addressMap.get(name);
    }

    public void removeAddress(String name) {
        addressMap.remove(name);
    }
}
