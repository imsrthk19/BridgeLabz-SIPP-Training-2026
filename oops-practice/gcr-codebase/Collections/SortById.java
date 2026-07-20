package Collections;
import java.util.Comparator;
public class SortById implements Comparator<StudentData>{
    @Override
    public int compare(StudentData s1, StudentData s2){
        return s1.id-s2.id;
    }
}

// for string data type, use .compareTo instead '-' sign