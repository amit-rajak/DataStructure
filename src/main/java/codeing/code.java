package codeing;

public class code {

    public static void main(String[] args) {

       //
        //Input: nums = [7,8,9,11,12]
        //Output: 1
        //Input: nums = [1,2,0]/3
        int arr[]={7,8,9,11,12};
        //int arr[]={1,2,0};
       System.out.println(SmallestPositiveIneger(arr));
    }

    public static int SmallestPositiveIneger(int arr[])
    {
        int min=arr[0];
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=1)
           {
               return 1;
           }
           else
           {
              if(arr[i+1]<arr[i])
              {
                  continue;
              }
              else
              {

              }
           }
       }

        return min+1;
    }
}


