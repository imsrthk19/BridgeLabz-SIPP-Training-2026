public interface ITrackable {
    void logActivity();

    default void resetData(){
        System.out.println("----------------------------");
        System.out.println("YOUR DATA HAS BEEN RESET");
        System.out.println("----------------------------");
    }
}
