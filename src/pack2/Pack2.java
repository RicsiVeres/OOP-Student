package pack2;
public class Pack2 {
    public void labor2(String[] args) {
        int[] A = new int[args.length];
        int allsum = 0;
        int odd = 1;

        for (int i = 0; i < args.length; i++) {
            A[i] = Integer.parseInt(args[i]);
            allsum += A[i];
            if (A[i] % 2 != 0){
                odd *= A[i];
            }
        }
        System.out.println("sum: " + allsum);
        System.out.println("odds: " + odd);
    }
}