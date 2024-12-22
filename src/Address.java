import java.util.Map;
import java.util.HashMap;

public class Address {
    private Map<String, String> addressMap;

    public Address() {  // 생성자 : Address 객체를 생성할 때 내부 Map을 초기화
        addressMap = new HashMap<>();
    }

    public void addAddress(String name, String address) {   // 주소 추가
        addressMap.put(name, address);
    }

    public String getAddress(String name) { // 주소 조회
        return addressMap.get(name);
    }

    public void removeAddress(String name) {    // 주소 삭제
        addressMap.remove(name);
    }

    public void printAddress() {    // 전체 주소록 출력
        for(Map.Entry<String, String> entry : addressMap.entrySet()) {
            System.out.println("Name : " + entry.getKey() + ", Address : " + entry.getValue());
        }
    }
}
