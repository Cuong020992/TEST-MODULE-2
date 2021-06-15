import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManagement {
    Scanner scanner = new Scanner(System.in);
    PhoneBook phoneBook = new PhoneBook();
    IOScanner ioScanner = new IOScanner();
    List<PhoneBook> phoneBookList;

    public PhoneBookManagement() {
        phoneBookList = new ArrayList<>();
    }


    //2 thêm
    public void addPhoneBook() {
        phoneBookList.add(ioScanner.inputPhoneBook());
        writeFile("phonebook.csv", this.phoneBookList);
        System.out.println("thêm thành công");
    }

    //1 hiển thị
    public String showPhoneBook() {
        this.phoneBookList = readFile("phonebook.csv");
        String str ="";
        for (PhoneBook phoneBook : phoneBookList) {
            str += phoneBook.toString() +"\n";
        }
        return str;
    }

    //3 sửa
    public void updatePhoneBook(String phoneNumber, PhoneBook phoneBook){
        if (findByPhoneNumber(phoneNumber) == null) {
            System.out.println("Số không tồn tại!");
        } else {
            ioScanner.inputUpdate(phoneBook);
            writeFile("phonebook.csv", this.phoneBookList);
            System.out.println("Sửa thành công!");
        }
        showPhoneBook();
    }

    //xóa
    public void deleteByPhoneNumber(String phoneNumber) {
        if (findByPhoneNumber(phoneNumber) == null) {
            System.out.println("Số không tồn tại!");
        } else {
            phoneBookList.remove(findByPhoneNumber(phoneNumber));
            writeFile("phonebook.csv", this.phoneBookList);
            System.out.println("Xóa thành công!");
        }
        showPhoneBook();
    }
//5 tìm
    public String findByPhoneNumber(String phoneNumber){

        for (PhoneBook phoneBook : phoneBookList){
            if(phoneBook.getPhoneNumber().equals(phoneNumber)){
                System.out.println("tìm thành công");
                System.out.println(phoneBook);
                return phoneNumber;
            }
        }
        System.out.println("Không tìm thấy");
        return null;
    }


    //7 ghi file
    public void writeFile(String path, List<PhoneBook> phoneBookList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(phoneBookList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("ghi không thành công");
        }
    }

    //6 đọc file
    public List<PhoneBook> readFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            phoneBookList = (List<PhoneBook>) objectInputStream.readObject();
            System.out.println(phoneBookList);
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception exception) {
            System.out.println("đọc không thành công");
        }
        return phoneBookList;
    }

}
