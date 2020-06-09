import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        System.out.println("Salam 3likom mes amis !.");
        Stream.of("Bouganfou","Tagguine","El bakal","Tariq").forEach(s->{
             System.out.println(s);
        });
    }
}
