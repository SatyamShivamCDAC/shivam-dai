package day5.save_data;

public interface SerializeToDB {
    void saveToDB();

    default void test() {
        System.out.println("In Serialize to DB");
    }
}
