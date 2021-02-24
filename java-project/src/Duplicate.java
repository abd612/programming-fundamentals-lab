public class Duplicate {
public static void main(String args[]){
int count = 0 ;
int [] A = new int[] {1,2,3,4,4,4,4,4,5,5,5,6,5,5,5,5,5,8};
int c = A.length;
System.out.println(c);
System.out.println("Array starts");
for (int i = 0 ; i< c ; i++){
for (int j = i+1 ; j < c ; j++) {
if (A[i] == A[j]) {
for (int p = j; p < c - 1; p++) {
A[p] = A[p + 1];
}
j= j -1;
c = c - 1;
}
}
}
for (int i = 0 ; i < c; i++){
System.out.println(A[i]);
}
}
}