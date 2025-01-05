import java.util.Scanner;

public class Application {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Application application = new Application();

        application.printStartMessage();
        application.showMenu();
        int order = application.receiveOrder();
    }

    private void printStartMessage() {
        System.out.println("주소록 프로그램에 오신 것을 환영합니다.");
        System.out.println("====================================");
    }

    private void showMenu() {
        System.out.println("원하는 기능의 숫자를 입력하세요.");
        System.out.println("1 : 주소 추가");
        System.out.println("2 : 주소 찾기");
        System.out.println("3 : 주소 삭제");
        System.out.println("4 : 주소록 초기화");
        System.out.println("5 : 프로그램 종료");
    }

    private int receiveOrder() {
        return scanner.nextInt();
    }
}
