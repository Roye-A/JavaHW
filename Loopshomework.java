import java.util.Scanner;

public class Loopshomework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.מה היא לולאה ? ומתי משתמשים בלולאה ?

        // לולאה היא טכניקת תכנות שמבצעת סדר פעולות מספר
        // פעמים על פי הפקודה שהרצת, נשתמש בלולאות כאשר אנוחנו
        // רוצים לקצר פקודות ארוכות ולא לרשום אותם מספר פעמים.

        //2.כתבו קוד המקבל 2 מספרים מהמשתמש
        // והדפס את הקטן מבניהם בלי שימוש ב if

//        System.out.println("enter 2 numbers : ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int min = (x < y) ? x : y;
//        System.out.println(min);

        //hodi's answer
//        int x ,y;
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        System.out.println(Math.min(x,y));
//        //
//        while (x<y){
//            System.out.println(x);
//            x=y;
//        }while (x>=y){
//            System.out.println(y);
//            y=x;
//        }

        // 3.כתבו קטע קוד שמדפיס את כל המספרים
        // המתחלקים ב 3 מ 0 עד 100 בעזרת לולאה

//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

          //hodi's answer
//        int c = 0;
//        while (c <= 100) {
//            if (c % 3 == 0)
//                System.out.println(c);
//            //c+=3;
//            c++;
//        }

        //4.כתבו קוד שמקבל מהמשתמש 8 מספרים
        // ומדפיס את הסכום של כל הקלטים (משתנה עזר ?)

//        System.out.println("please enter 8 numbers : ");
//        int sum = 0;
//        for (int i = 0; i < 8; i++) {
//            int num = scanner.nextInt();
//            if (num != 0){
//                sum = sum + num;
//                }
//            System.out.println(sum);
//        }

        //hodi's answer
//        int sum = 0;
//        for (int i = 0; i < 8; i++){
//            int num = scanner.nextInt();
//            sum = sum + num;
//        }
//        System.out.println(sum);

        //5.כתוב תכנית מחשב הקולטת מספרים
        // עד אשר נקלט מספר שלילי

//        int num;
//        System.out.println("please enter a number: ");
//        num = scanner.nextInt();
//        while (num >= -1) {
//            System.out.println(num);
//            num = scanner.nextInt();
//        }

        //hodi's answer
//        int input = scanner.nextInt();
//        while (input > 0){
//            input = scanner.nextInt();
//        }
//        System.out.println("done");

        //6.הדפיסו את כל המספרים מ 100 עד 1000 בלולאה

//        for (int i = 100; i <= 1000; i++) { // i=i+5
//            System.out.println(i);
//        }

        //7.קלטו מהמשתמש 4 שמות והדפיסו אותם בעזרת לולאה

//        for (int i = 0; i < 4; i++) {
//            String name = scanner.next();
//            System.out.println(name);
//        }

        //hodi's answer
//        String name ="";
//        for (int i = 0; i < 4; i++){
//            name = name +" "+scanner.nextInt();
//        }
//        System.out.println(name);

        //8.כתבו קוד המקבלת מהמשתמש 5 מספרים
        // ובכל פעם מדפיס אם המספר זוגי או אי זוגי

//        for (int i = 0; i < 5; i++) {
//            System.out.println("please enter a number :");
//            int num = scanner.nextInt();
//            if (num % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        }

        //9.כתבו קוד המקבל מספרים עד שסכום כל
        // המספרים ביחד עובר את ה 100 ואז להדפיס את הסכום

//        int sum = 0;
//        while (sum < 100){
//            int num = scanner.nextInt();
//            sum = num+num;
//        }
//        System.out.println(sum);

        //  10.כתבו תוכנית המקבלת מהמשתמש 10 ערכים ומחשבת
        // את הסכום של המספרים במקום הזוגי כלומר -
        // סכום המספר השני והרביעי והשישי שהמשתמש מכניס

        // 2+4+6+8+10=30
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            int num = scanner.nextInt();
//            if (i % 2 == 0)
//                sum = sum + num;
//        }
//        System.out.println(sum);


        //11.כתוב קוד המקבל מהמשתמש 10 מספרים
        //ומדפיס את הממוצע של כל המספרים

//        System.out.println("enter 10 number :");
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < 10; i++) {
//            int num = scanner.nextInt();
//            sum = sum + num;
//            avg = sum / 10;
//        }
//        System.out.println("avg = " + avg);



        //12.אתגר : כתבו תוכנית המחשבת את העצרת
        //של המספר שהמשתמש מכניס בתור קלט
        //5!= 5*4*3*2*1 = 120 וזה ה 5 עצרת

        // n! = n * (n-1) * (n-1) * (n-1) * (n-1)
//        long multi = 1l;
//        int n = scanner.nextInt();
//        while (n > 0){
//            multi = multi * n;
//            n--;
//        }
//        System.out.println(multi);
//

        
    }

}




