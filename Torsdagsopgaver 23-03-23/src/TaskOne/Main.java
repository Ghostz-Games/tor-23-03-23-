package TaskOne;

public class Main {
    public static void main(String[] args) {

        methodA("Start");

    }


    public static void methodA(String input){
        if(input.equals("Start")){
            System.out.println("J");
            methodB(input);
        }
        else if(input.equals("e")){
            System.out.println(input);
            methodB("rar");
        }else {
            System.out.println(input);
            methodB("rov");
        }
    }

    public static void methodB(String input){
        char charOutput = input.charAt(2);
        System.out.println(charOutput);
        methodC(charOutput);
    }

    public static void methodC(char input){
        if(input == 'a'){
            System.out.println("v");
            methodD('a');
        }else if(input == 'r') {
            System.out.println("s");
            methodD('l');
        }else if(input == 'v'){
            System.out.println("t");
            System.out.println(":)");
        }
    }

    public static void methodD(char input){
        if(input == 'a') {
            System.out.println('a');
            methodA("e");
        }else if(input == 'l'){
            System.out.println("j");
            methodA("o");
        }
    }



}



