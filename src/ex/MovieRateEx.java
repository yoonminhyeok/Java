package ex;

public class MovieRateEx {
    public static void main(String[] args) {

        double rating=7;
        String movie;
       if(rating<=9)
       {
           movie="어바웃타임";
           System.out.println(movie+"를 추천합니다");
       }
        if(rating<=8)
        {
            movie="토이 스토리";
            System.out.println(movie+"를 추천합니다");
        }
        if(rating<=7)
        {
            movie="고질라";
            System.out.println(movie+"를 추천합니다");
        }
       
    }
}
