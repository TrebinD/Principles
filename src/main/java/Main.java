public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Василий";
        post.surName = "Васильев";
        post.patronymic = "Иванович";
        post.passport = 1234_567894L;
        post.phone = 8_911_111_11_11L;
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 2;
        post.birthday.month = 3;
        post.birthday.year = 2022;


    }
}
