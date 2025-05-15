
import java.util .Scanner;

import LibraryManagement.Book;
import LibraryManagement.Member;

public class Test1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Book Title:");
            String title = sc.nextLine();
            System.out.println("Enter Book Author:");
            String author = sc.nextLine();
            System.out.println("Enter Book ISBN:");
            String isbn = sc.nextLine();
            Book book = new Book(title, author, isbn);
            System.out.println("Enter Member name:");
            String name = sc.nextLine();
            System.out.println("Enter Member id:");
            String memberId = sc.nextLine();
            Member member = new Member(name, memberId);
            System.out.println("-----Book Details-----");
            book.displyBook();
            System.out.println("-----Member Details-----");
            member.displyMember();
            sc.close();
        }
}
/*
 Enter Book Title:
Introduction to JAVA
Enter Book Author:
A.K. Sharma
Enter Book ISBN:
24245892
Enter Member name:
Parvej Mulani
Enter Member id:
50
-----Book Details-----
Book Title:Introduction to JAVA
Book Author:A.K. Sharma
ISBN:24245892
-----Member Details-----
Member Name:Parvej Mulani
Member id:50
 */
