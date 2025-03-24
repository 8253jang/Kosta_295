package stream.exam.sol;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 학생의 전공과 점수 목록을 출력 (map + collect)
 *  List<Student>에서 학생의 전공과 점수를 "전공: 점수" 형태의 리스트로 출력하시오.
 * */
public class Test07 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
        		 new Student("희정", 22, 88.5, "Computer Science"),
                 new Student("가현", 24, 76.2, "Mathematics"),
                 new Student("찬범", 23, 92.3, "Computer Science"),
                 new Student("현솔", 25, 81.7, "Physics")
        );

        
        List<String> majorAndScores = students.stream() //Stream<Student>
        	    .map(s -> s.getMajor() + ": " + s.getScore())// Stream<String>  -> Mathematics : 76.2
        	    .collect(Collectors.toList());

        	System.out.println("전공과 점수 목록: " + majorAndScores);





    }
}
