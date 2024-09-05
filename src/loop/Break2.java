package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;

        for(i=1; ; i++)
        {
            sum+=i;
            if(sum>10)
                break;
        }

        System.out.println(i);
    }
}
