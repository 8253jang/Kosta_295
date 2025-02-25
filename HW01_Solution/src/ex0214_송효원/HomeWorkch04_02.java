package ex0214_송효원;

// 교제 2번 문제

public class HomeWorkch04_02  {
    public static void main(String[] args) {
        String grade = "A";
         // 17version
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100-2;
                yield result;
            }
            default -> 60;
        };
        
        System.out.println(score1);
    }
}

