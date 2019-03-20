public class Task3 {
    static RomanConvert romanConverting = new RomanConvert();

    static RomeConvertBack romeConvertBack = new RomeConvertBack();





    public static void main(String[] args) {




        In in = new In();
        in.Scan();
        String date=in.date;
        Task3 task3 = new Task3();




//chars
        char numberAfterc =   task3.getDateFromStringAfter(date).charAt(0);
        char numberBeforec =  task3.getDateFromStringBefore(date).charAt(0);



        String numberAfter =   task3.getDateFromStringAfter(date);
        String numberBefore =  task3.getDateFromStringBefore(date);



    int a = numberAfterc -'0';
    int b = numberBeforec - '0' ;






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        if (date.contains("+")&&Character.isDigit( numberAfterc ) &&Character.isDigit( numberBeforec )   ) {
            System.out.println(task3.plus(a, b));
        }
        else if (date.contains("-")&&Character.isDigit( numberAfterc ) &&Character.isDigit( numberBeforec )){
            System.out.println(task3.minus(a, b));
        }
        else if (date.contains("*")&&Character.isDigit( numberAfterc ) &&Character.isDigit( numberBeforec )){
            System.out.println(task3.multiply(a, b));
        }

        else if (date.contains("/")&&Character.isDigit( numberAfterc ) &&Character.isDigit( numberBeforec )){
            System.out.println(task3.divide(a, b));
        }
        else if (date.contains("+")) {


            int h2= romanConverting.romanConvert(numberAfter);
            int  h = romanConverting.romanConvert(numberBefore);
            int c = task3.plus(h,h2);
            System.out.println(romeConvertBack.convert(c));



        }
        else if (date.contains("-")) {
            int h2= romanConverting.romanConvert(numberAfter);
            int  h = romanConverting.romanConvert(numberBefore);
            int c = task3.minus(h2,h);
            System.out.println(romeConvertBack.convert(c));



        }

        else if (date.contains("*")) {
            int h2= romanConverting.romanConvert(numberAfter);
            int  h = romanConverting.romanConvert(numberBefore);
            int c = task3.multiply(h2,h);
            System.out.println(romeConvertBack.convert(c));



        }

        else if (date.contains("/")) {

            int h2= romanConverting.romanConvert(numberAfter);
            int  h = romanConverting.romanConvert(numberBefore);
            int c = task3.divide(h2,h);
            System.out.println(romeConvertBack.convert(c));

        }else if ((Character.isLetter(numberAfterc) && Character.isDigit(numberBeforec) ||
                (Character.isLetter(numberBeforec) && Character.isDigit(numberAfterc)  ))){

            System.out.println("Invalid format");


        }







    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  String getDateFromStringAfter(String date){
        if (date.contains("+")) {

           String a = date.substring(0, date.indexOf("+") );
           return a;
        }
        else if (date.contains("-")) {
            String a = date.substring(0, date.indexOf("-") );
            return a;
        }
        else if (date.contains("*")) {
            String a = date.substring(0, date.indexOf("*") );
            return a;
        }
        else if (date.contains("/")) {
            String a = date.substring(0, date.indexOf("/") );
            return a;
        }else  return "";


    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  String getDateFromStringBefore(String date){
        if (date.contains("+")) {
            String a = date.substring(date.lastIndexOf("+") + 1);
            return a;
        }
        else if (date.contains("-")) {
            String a = date.substring(date.lastIndexOf("-") + 1);
            return a;
        }
        else if (date.contains("*")) {
            String a = date.substring(date.lastIndexOf("*") + 1);
            return a;
        }
        else if (date.contains("/")) {
            String a = date.substring(date.lastIndexOf("/") + 1);
            return a;
        }else return "";


    }


    public int plus (int a, int b){
        return a + b;
    }

    public int minus (int a,int b){
        return a - b;

    }

    public int divide (int a,int b){
        return a / b;
    }


    public int multiply (int a,int b){
        return a * b;
    }




}
