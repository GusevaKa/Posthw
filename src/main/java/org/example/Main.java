package org.example;
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Екатерина";
        post.passport = "2222№88899977";
        post.patronymic = "Гусева";
        post.phone = "+7(915)944-31-36";
        post.surname = "Гусева";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 03;
        post.birthday.year = 1992;
    }
}
