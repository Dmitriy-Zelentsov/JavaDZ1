// Вывести все простые числа от 1 до 1000

public class Ex2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n ; i++){
            boolean chek = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    chek = false;
                    break;
                }                
            }
            if(chek == true){
                System.out.println(i);
            }
        }
    }
}
