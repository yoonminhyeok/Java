package loop;

public class Break1 {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while(i>0)
        {
            sum+=i;
            if(sum>10)
                break;
            i++;
        }

        System.out.println(i);
    }
}
