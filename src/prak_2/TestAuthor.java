package prak_2;

public class TestAuthor {
    public static void main(String[] argc) {
        Author a1 = new Author("Bob", "bob@mail.com", 'm');

        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        System.out.println(a1);

        a1.setEmail("bob2test@gmail.com");
        System.out.println(a1);
    }
}
