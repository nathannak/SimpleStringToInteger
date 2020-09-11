public class Main {

    public static void main(String[] args) {

        System.out.println(stoi("9781"));

    }

    public static int stoi (String s) {

        int w=1;
        int sum=0;

        for(int i = s.length()-1 ; i >= 0 ; i--){

            char c = s.charAt(i);
            sum = sum + (w*(c-'0'));
            w *= 10;

        }

        return sum;

    }

}
