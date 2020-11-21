public class Calculator {
        int a;
        int b;
        int c;

        int add(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
            return (a + b + c);
        }

        int add(int a, int b){
            a = a;
            b = b;
            c = 0;
            return (a + b + c);
        }

        int subtract(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
            return (a - b - c);
        }

        int subtract(int a, int b){
            this.a = a;
            this.b = b;
            c = 0;
            return (a - b - c);
        }
}
