public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "8(800)555-35-35";
        post.surname = "Иванов";
        post.subscription = "true";

        post.birthday = new FormDate();
        post.birthday.day = "18";
        post.birthday.month = "9";
        post.birthday.year = "2000";
    }







}
