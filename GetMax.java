public class GetMax {
    public static int max(int[] m) {
       int big = 0;
       for(int i = 0; i < m.length - 1; i++){
          if(m[i] > big){
             big = m[i];
          }
       }
       return big;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.print(max(numbers));
    }
 }
