public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        String[] season = {"Winter","Spring", "Summer", "Autumn"};

        // Задание 2

        for(int i = 0; i < arr1.length ; i++){
            if(i< (arr1.length - 1)){
                System.out.print(arr1[i] + ", ");}
            else{
                System.out.print(arr1[i]);
            }
        }

        System.out.print('\n');

        for(int i = 0; i < arr2.length ; i++){
            if(i < (arr2.length - 1)){
                System.out.print(arr2[i] + ", ");}
            else{
                System.out.print(arr2[i]);
            }
        }
        System.out.print('\n');

        for(int i = 0; i < season.length ; i++){
            if(i < (season.length - 1)){
                System.out.print(season[i] + ", ");}
            else{
                System.out.print(season[i]);
            }
        }

        // Задание 3

        System.out.println('\n');

        for(int i = (arr1.length-1); i >= 0 ; i--){
            if(i > 0){
                System.out.print(arr1[i] + ", ");}
            else{
                System.out.print(arr1[i]);
            }
        }

        System.out.print('\n');

        for(int i = (arr2.length-1); i >= 0 ; i--){
            if(i > 0){
                System.out.print(arr2[i] + ", ");}
            else{
                System.out.print(arr2[i]);
            }
        }
        System.out.print('\n');

        for(int i = (season.length - 1); i >= 0; i--){
            if(i > 0){
                System.out.print(season[i] + ", ");}
            else{
                System.out.print(season[i]);
            }
        }

        System.out.println();

        // Задание 4

        for(int k = 0; k < arr1.length; k++){
            if(arr1[k]%2 !=0){
                arr1[k]=arr1[k]+1;
            }
            System.out.print(arr1[k] + " ");
        }

    }
}