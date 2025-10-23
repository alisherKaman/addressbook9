package actions;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    ArrayList<Contact> contacts = new ArrayList<>();

    String contactName;
    String contactJobTitle;
    String contactBirthday;
    String contactPhone;
    String contactEmail;

    public Contact() {
    }

    public Contact(String contactNameA, String contactJobTitleA, String contactBirthdayA, String contactPhoneA, String contactEmailA) {
        this.contactName = contactNameA;
        this.contactJobTitle = contactJobTitleA;
        this.contactBirthday = contactBirthdayA;
        this.contactPhone = contactPhoneA;
        this.contactEmail = contactEmailA;
    }

    public void createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи имя: ");
        contactName = sc.nextLine();
        System.out.print("Введи Должность: ");
        contactJobTitle = sc.nextLine();
        System.out.print("Введи дату рождения: ");
        contactBirthday = sc.nextLine();
        System.out.print("Введи телефон: ");
        contactPhone = sc.nextLine();
        System.out.print("Введи email: ");
        contactEmail = sc.nextLine();

        if (contacts.size() <= 1) {
            System.out.println("Добавьте еще пару аккаунтов ");
        } else {

            if (ifExistsContact(contactName)) {
                System.out.println("---Подождите---");
                updateContact();
            } else {
                System.out.println("Недостаточно аккаунтов для проверки!");
            }
        }
        contacts.add(new Contact(contactName, contactJobTitle, contactBirthday, contactPhone, contactEmail));
    }

    public String getName() {
        return contactName;
    }

    public boolean ifExistsContact(String checkName) {
        boolean flag = false;
        if (contacts.size() <= 1) {
            flag = false;
        } else {
            for (int i = 0; i <= contacts.size() - 1; i++) {
                if (contacts.get(i).getName().equals(checkName)) {
                    System.out.println("---text---");
                    flag = true;
                }
            }

        }
        return flag;
    }

    public void updateContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("---Данные обновляются, подождите!---");
        System.out.println();
        System.out.print("Введите вашу новую должность: ");
        contactJobTitle = sc.nextLine();
        System.out.print("Введите вашу новую дату рождения: ");
        contactBirthday = sc.nextLine();
        System.out.print("Введите ваш новый номер телефона: ");
        contactPhone = sc.nextLine();
        System.out.print("Введите ваш новый email: ");
        contactEmail = sc.nextLine();
        System.out.println("---Ваш контакт обновлен---");
    }

    public void deleteContact(String deleteName) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= contacts.size() - 1; i++) {
            if (contacts.get(i).getName().equals(deleteName)) {
                contacts.remove(i);
                break;
            }
        }
    }

    public void showAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.contactName);
            System.out.println(contact.contactJobTitle);
            System.out.println(contact.contactBirthday);
            System.out.println(contact.contactPhone);
            System.out.println(contact.contactEmail);
        }
    }
}
