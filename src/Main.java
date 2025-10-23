import actions.Contact;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - новый контакт");
            System.out.println("2 - удаление существующего контакта");
            System.out.println("3 - вывод всех контактов");
            System.out.println("4 - завершение работы");
            System.out.println("Введите нужную опцию и нажмите Enter");
            int choice = scanner.nextInt();
            if (choice < 1 && choice > 4) {
                System.out.println("У нас нету данной команды ");
            } else {
                switch (choice) {
                    case 1:
                        contact.createContact();
                        break;
                    case 2:
                        System.out.println("---С каким именнем аккаунт вы хотите удалить---");
                        String deleteName = sc.nextLine();
                        contact.deleteContact(deleteName);
                        System.out.println("---Аккаунт с именем " + deleteName + " полностью удален с ваших контактов---" );
                        break;
                    case 3:
                        contact.showAllContacts();
                        break;
                    case 4:
                        System.out.println("Выход с приложения!");
                        break;

                    default:

                }
            }
        }
    }
}