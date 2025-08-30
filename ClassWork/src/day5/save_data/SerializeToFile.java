package day5.save_data;

public interface SerializeToFile {
    void saveToFile();

    default void test() {
        System.out.println("In Serialize to File");
    }
}
