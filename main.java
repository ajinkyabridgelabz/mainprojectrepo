class main{
// Sample java code
class Main {
    public static void main(String[] args) {
            Main.showMe("Mayur");
    }

    // code to be written by tanuja
static int factorial(int n){
        int factorial = 1;
        int i =1;
        while (i <= n){
            factorial*=i;
            i++;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n =7 , r = 3, permutation;
        permutation = factorial(n) / factorial(n-r);
        System.out.println("Permutation: "+permutation);
    }
}
    // Code to be written by P Mayur


    static String showMe(String name) {
        return "Hiiii " + name;
    }
}
