//Prime Number Find(1 or itself)

public class PrimeNumber{
public static void main(String[]args){
 
for(int i=2;i<100;i++){
int s=0;


 for(int j=2;j<i; j++){

if(i%j==0){

s=1;

break;
}
}

if(s==0){
System.out.print(i);
System.out.print(" ");
}
 
}
}
}

   

