//average of array elements
#include<stdio.h>


int main(){

  //inserion of array elements 
  int ar[6];
  printf("Enter 6 elements of the array: \n");
  for(int i=0;i<6;i++){
    printf("Enter the element %d: ",i+1);
    scanf("%d",&ar[i]);
  }

  int n=sizeof(ar)/sizeof(ar[0]);
  int val;
  int k=0;
  int sum=0;
  float avg;  

  //Array 
   printf("Array: "); 
  for(int i=0;i<n;i++){
    printf("%d ",ar[i]);
  }            

  for(int i=0;i<n;i++){
    sum+=ar[i];
  }
  avg=(float)sum/n;
  printf("Average of array elements: %.2f\n",avg);


   printf("\nEnter the value to delete from the array: ");    
  scanf("%d",&val);

  for(int i=0;i<n;i++){
    if(ar[i]!=val){   
      ar[k]=ar[i];
      k++;
    }
  }
  printf("Array after deletion: ");
  for(int i=0;i<k;i++){
    printf("%d ",ar[i]);
  }
  printf("\n");

 

  //inserting element in array
  int position;
  printf("\nEnter the position to insert the new element (0 to %d): ",n-1);
  scanf("%d",&position);  
  int newelement; //new value to insert
  printf("\nEnter the new element to insert: ");
  scanf("%d",&newelement);

  for(int i=n; i>position; i--){
    ar[i]=ar[i-1];
  }
  ar[position]=newelement;

  printf("\nArray after insertion: ");
  for(int i=0;i<n;i++){
    printf("%d ",ar[i]);
  }


   return 0;
}

//
