package class7;

public class Prg1 {
    public static void main(String[] args) {
        // (condition)?<left>:<right>
        int age = 16;
        System.out.println((age < 21) ? 10 : 20);
        System.out.println((age <= 21) ? "minor" : "major");

        var variable = (age <= 21) ? "minor" : 1;
        System.out.println(variable);

        String string = age < 18 ? (age < 10) ? "baby" : "teen"
                : "u have to do job";
        System.out.println(string);
    }
}
