public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Федорович";
        post.surname = "КрузенштернЧеловекИПароход";
        post.phone = "2225332222";
        post.passport = "0000/123456";
        post.subscription = "thrue";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 11;
        post.birthday.year = 1986;

    }
}
