public class Arrays {
    public static void main(String[] args) {
        //arrays are stored in contiguous memory location
        //once the capacity of the array is defined you cannot change the size of the array

        int []nums=new int[5];
        System.out.println(nums[0]);
        System.out.println(nums.length);

        //predefined array
        int []marks={87,95,91};
        System.out.println(marks[0]);


        //for each loop in arrays or any iterable data structure
        //just like c++
        for(int mark:marks){
            System.out.println(mark);
        }

        //getting the min marks from the arrya
        int mini=Integer.MAX_VALUE;
        for(int mark:marks){
            mini=Math.min(mark,mini);
        }
        System.out.println(mini);

        //declaring 2d arrays
        int [][]matrix=new int[2][2];

        //Math class methods
        //Math.min
        //Math.max
        //Math.ceil(x)
        //Math.sqrt(x)
        //Math.pow(x,y)
        //Math.round(x)
        //Math.random()
        //Math.abs(x)




    }
}
