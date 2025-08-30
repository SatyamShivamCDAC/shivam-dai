package day5.save_data;

public class SerializeData {
    public static void saveDataToFile(SerializeToFile obj) {
        obj.saveToFile();
    }

    public static void saveDataToDB(SerializeToDB obj) {
        obj.saveToDB();
    }
}
