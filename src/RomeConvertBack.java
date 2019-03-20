public class RomeConvertBack {



    public  String convert(int in) {
        StringBuffer a = new StringBuffer("");



        int x1 = in / 10;
        a.append(X(x1));
        int x2 = in % 10;


        a.append(basic(x2));
        return a.toString();
    }

    public  String X(int in) {

         if ((in != 0)){
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        }
        else return "";
    }



    public  String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }

}
