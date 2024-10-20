package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");

           }

           //1. 기본 구분자로 문자열을 분리해서 합산
        public static int calculateSum(String input) {
            String[] tokens = input.split(",|:"); //쉼표 또는 콜론으로 기본구분자 처리
            int sum = 0;
            for (String token : tokens){
                sum += Integer.parseInt(token);
            }
            return  sum;
    }

    // 2. 빈 문자열 , null을 처리후에 계산
    public static  int add (String input) {
        if(input == null || input.isEmpty()){
            return 0;
        }
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("\n");
            String delimiter = input.substring(2, delimiterIndex); // 커스텀 구분자 추출
            String numbers = input.substring(delimiterIndex + 1); // 숫자 부분 추출
            return calculateSum(numbers, delimiter);
        }

        return  calculateSum(input);
    }

    //3. 커스텀 구분자 문자열 분리
    public static int calculateSum(String input,String delimiter){
        String[] tokens = input.split(delimiter);
        int sum = 0;

        for (String token : tokens){
             sum += Integer.parseInt(token);
            }
            return  sum;
        }

}

