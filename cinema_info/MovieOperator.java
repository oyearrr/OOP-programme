package cinema_info;
import java.util.Scanner;
public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    public void printInfo(){
        for(int i=0;i<movies.length;i++){
            Movie m = movies[i];
            System.out.println("电影编号："+m.getId()+"  电影名称："+m.getName()+"  电影评分："+m.getScore()+"  主演："+m.getActor());

        }
    }
    public void search(){
        System.out.println("请输入要查询的编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for(int i=0;i<movies.length;i++){
            Movie m = movies[i];
            if(id==m.getId()){
                System.out.println("编号："+m.getId()+"  名称："+m.getName()+"  评分："+m.getScore()+"  主演："+m.getActor());
                return;
            }
        }
        System.out.println("没有此编号");
    }
}
