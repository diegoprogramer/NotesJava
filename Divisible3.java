public class Divisible3 {
    public static void main(String[] args) {
        System.out.println("programa buzz");
        Integer [] ordenar = {1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        for ( Integer integer : ordenar){
            System.out.println(" value"+ integer);

            if (integer % 3 == 0 && integer % 5==0){
                System.out.println("fizz buzz");

            } else {
                
                            if(integer % 3 == 0){
                                System.out.println(" Fizz: "+integer);
                            } else
                
                            if(integer % 5 == 0){
                                System.out.println(" buzz: "+integer);
                            }

            }

        }
    }
}
