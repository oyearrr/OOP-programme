package cinema_info;

//aim：打印电影信息，并输入id获取电影信息
public class Test {


    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1,"唐顿庄园",9.5,"罗宾·怀特");
        movies[1] = new Movie(2,"夏洛特烦恼",9.1,"沈腾");
        movies[2] = new Movie(3,"让子弹飞",9.8,"姜文");
        movies[3] = new Movie(4,"速度与激情",9.4,"瑞秋·费尔南多");
        movies[4] = new Movie(5,"肖申克的继续",9.9,"Tom·Robbins");
        movies[5] = new Movie(6,"星际穿越",9.7,"安妮海瑟薇");

        MovieOperator m = new MovieOperator(movies);
        m.printInfo();
        m.search();

    }


}
