public class cr_1_rectangle_1 {
    public static void main(String[] args) {

                                            //RECTANGLE//
        //POINT 1, POINT 2 and Point 3
        // create a solution for the following problem: given a width and a height of a rectangular,
        // (image below, left side), calculate the rectangularArea

        int width = 5;
        int height = 2;
        int rectangularArea = width * height;

        System.out.println("The rectangularArea is: "+rectangularArea+"m");

        System.out.println("Rectangle 20x30 has a area of: "+calculateRectArea(20, 30));
        System.out.println("Rectangle 30x40 has a area of: "+calculateRectArea(30,40));


        //POINT 5

        System.out.println("Rectangle 20x30 has a area of: "+calculateRectArea(50, 80));
        System.out.println("Rectangle 30x40 has a area of: "+calculateRectArea(60,90));


        //Bonus Point 1
        int [] arr1 = {6,8,10,15};
        int [] arr2 = { 10,14,18,20};
        for (int i = 0; i < arr1.length; i++){
            System.out.println("The Area if this Area is: "+i+ "is"+ calculateRectArea(arr1[i],arr2[i]));
        }


    }

    public static int calculateRectArea(int x, int y){
        return x * y;
    }


}
