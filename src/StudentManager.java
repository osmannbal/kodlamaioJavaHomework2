public class StudentManager {
    public void add(Logger logger){
        System.out.println("Öğrenci eklendi.");
        logger.Log();
    }

    public void update(Logger logger){
        System.out.println("Öğrenci güncellendi.");
        logger.Log();
    }

    public void delete(Logger logger){
        System.out.println("Öğrenci silindi.");
        logger.Log();
    }
}
