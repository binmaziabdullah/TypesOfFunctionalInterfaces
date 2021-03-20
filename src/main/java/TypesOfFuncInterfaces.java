import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

    /*following are the important Functional Interfaces
    * 1.Predicate - predicate is the fi present util.function which takes parameter as T which his type of argument
    * and check the boolean condition and return the boolean,it has only one Am test().

    * 2.Function - function is the fi in util.function package and it takes two argument as T,R in which T
    * is the argument type and R is the return type and return any type based on the operation perform
    * it is usually use to transform one object to another object it has only one Am apply().

    * 3.Consumer - consumer is the fi in util.function package and it takes one argument of type T
    * and returns nothing its just accept the type of argument ,it has only one Am accept()

    * 4.Supplier - supplier is the fi in util.function package and it takes no argument
    * and returns any type */

public class TypesOfFuncInterfaces {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rameshwar", "Hyderabad"),
                new Student("Saket", "Mumbai"),
                new Student("Sankalp", "Mumbai"),
                new Student("Sanchit", "Hyderabad"),
                new Student("Chinna", "Cheenai"));

        Predicate<Student> studentPredicate = s -> s.getName().startsWith("S");
        for (Student student : students) {
            if (studentPredicate.test(student))
                System.out.println(student);
        }
        System.out.println();

        Function<Integer, Double> Function = integer -> (double) (integer * integer);
        System.out.println("The square root of the given number is"+" "+Function.apply(5));
        System.out.println();


        Student s = new Student("BOM","Sahil");
        Consumer<Student> studentConsumer = students1 -> students1.setName("Sahil Khan");
        studentConsumer.accept(s);
        System.out.println(s.getName());
        System.out.println();


        Supplier<String> stringSupplier = () -> "Hello this is Supplier";
        System.out.println(stringSupplier.get());

    }
}
