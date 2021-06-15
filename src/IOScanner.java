import java.util.Scanner;

public class IOScanner {
Scanner scanner = new Scanner(System.in);

    public IOScanner() {
    }

    public PhoneBook inputPhoneBook(){
        System.out.println("nhập số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập nhóm danh bạ");
        String group = scanner.nextLine();
        System.out.println("nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String birthday = scanner.nextLine();
        System.out.println("nhập Email");
        String email = scanner.nextLine();
        if(phoneNumber != null && group != null && name != null && gender != null && address != null && birthday!= null && email!= null){
            PhoneBook phoneBook = new PhoneBook(phoneNumber, group, name, gender, address, birthday, email);
            return phoneBook;
        }
        System.out.println("Nhập thiếu, yêu cầu nhập lại");
        return null;
    }

    public void inputUpdate(PhoneBook updatePhone){
        System.out.println("nhập số điện thoại (mới): ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber != null) {
            updatePhone.setPhoneNumber(phoneNumber);
        }

        System.out.println("nhập nhóm (mới): ");
        String group = scanner.nextLine();
        if (group != null) {
            updatePhone.setGroupPhoneBook(group);
        }

        System.out.println("nhập tên (mới): ");
        String name = scanner.nextLine();
        if (name != null) {
            updatePhone.setName(name);
        }

        System.out.println("nhập giới tính (mới): ");
        String gender = scanner.nextLine();
        if (gender != null) {
            updatePhone.setGender(gender);
        }

        System.out.println("nhập địa chỉ (mới): ");
        String address = scanner.nextLine();
        if (address != null) {
            updatePhone.setAddrress(address);
        }

        System.out.println("nhập ngày sinh (mới): ");
        String birthday = scanner.nextLine();
        if (birthday != null) {
            updatePhone.setBirth(birthday);
        }

        System.out.println("nhập email (mới): ");
        String email = scanner.nextLine();
        if (email != null) {
            updatePhone.setEmail(email);
        }
    }
}
