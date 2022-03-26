package Data_structure_and_algorithm;

import java.util.Scanner;

public class merge_sort
{
    void merge(int arr[],int l,int r,int mid)
    {
        int sizeOfLeftArray = mid-l+1;
        int sizeOfRightArray = r-mid;
        int LeftArray[] = new int[sizeOfLeftArray];
        int RightArray[] = new int[sizeOfRightArray];
        for(int i=0;i<sizeOfLeftArray;i++)
            LeftArray[i] = arr[l+i];
        for(int i=0;i<sizeOfRightArray;i++)
            RightArray[i] = arr[mid+1+i];
        int i=0,j=0,k=l;
        while(i<sizeOfLeftArray && j<sizeOfRightArray)
        {
            if(LeftArray[i]<RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while(i<sizeOfLeftArray)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while(j<sizeOfRightArray)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
    void sorting(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;
            sorting(arr,l,mid);
            sorting(arr,mid+1,r);
            merge(arr,l,r,mid);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        new merge_sort().sorting(arr,0,size-1);
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");

    }
}
