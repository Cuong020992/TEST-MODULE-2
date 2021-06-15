import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneBookManagement phoneBookManagement = new PhoneBookManagement();

    public static void main(String[] args) {
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    phoneBookManagement.showPhoneBook();
                }
                break;
                case "2": {
                    phoneBookManagement.addPhoneBook();
                }
                break;
                case "3": {
                    System.out.print("nhập tìm số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManagement.updatePhoneBook(phoneNumber, phoneBookManagement.phoneBook);
                }
                break;
                case "4": {
                    System.out.print("nhập tìm số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManagement.deleteByPhoneNumber(phoneNumber);
                }
                break;
                case "5": {
                    System.out.print("nhập số điện thoại cần tìm: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManagement.findByPhoneNumber(phoneNumber);
                }
                break;
                case "6": {
                    phoneBookManagement.readFile("phonebook.csv");
                }
                break;
                case "7": {
                    phoneBookManagement.writeFile("phonebook.csv", phoneBookManagement.phoneBookList);
                }
                break;
                default: {
                    System.out.println("yêu cầu nhập lại");
                }
                break;
            }
        } while (!choice.equals("8"));

    }

    public static void menu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
        ;
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
    }
}
