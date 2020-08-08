public class CalebCurryMed {


    public static void main(String[] args)  {

        // MULTI DIMENSIONAL ARRAYS
        int [][] data =  {
                {4 ,6, 3, 10},
                {4, 2, 40, 1, 98, 52},
                {5, 31, 1, 43}
        };
        //data[1][2] = 49;
        //System.out.println(data[1][2]);
        System.out.println(data.length);
        System.out.println(data[0].length);

        for (int i = 0; i < data.length;i++){
            for (int j = 0; j < data[i].length;j++){
                System.out.print(data[i][j] + " ");
            }
           // System.out.println("row index " + i);
            System.out.println();
        }

    }
}
