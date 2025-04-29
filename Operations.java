class Operations{
     int add(int a,int b){
        return a+b;
     }
     int sub(int a,int b){
        return a-b;
     }
     int mul(int a,int b){
        return a*b;
     }
     int div(int a,int b){
        return a/b;
     }
}

public class Demo{
    public static void main(String[] args) {
        Operations op = new Operations(){
            system.out.println("addition: " + op.add(8,4));
            system.out.println("Subtraction: " + op.sub(8,4));
            system.out.println("multiplication: " + op.mul(2,4));
            system.out.println("division: " + op.div(8,4));
        }

    }
}

