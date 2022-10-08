package kapitel6;

public class String_Test {
    public static void main(String[] args) {
        String info = "Simon,Korntal,Brezel";
        String[] infos = info.split(",");
        for(String s : infos)
            System.out.println(s);

        String replace = "AbCdEfFGda+srop1´3".replace("´", "WTF").replaceAll("(\\d)", "Y");
        System.out.println(replace);

        StringBuilder builder = new StringBuilder("builder");
        for(int i = 0; i < 25; i++) {
            builder.append(i).append("-");
            builder.reverse();
        }

        System.out.println(builder.toString());
    }
}
