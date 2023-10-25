
public class Arthimatic{
	public static void main(String[]args) {
	}
public int sum(int a, int b){
int c;
c=a+b;
System.out.println("the sum of 2 no"+c);
return c;
}
public int sub(int x, int y){
int z;
z=x-y;
System.out.println("the sub of 2 no"+z);
return z;
}
public int mul(int a1,int a2){
int a3;
a3=a1*a2;
System.out.println("the mul of 2 no"+a3);
return a3;
}
public int div(int b1,int b2){
int b3;
b3=b1/b2;
System.out.println("the mul of 2 no"+b3);
return b3;
}

Arthimatic Obj=new Arthimatic();
int sumresult =Obj.sum(10,2);
int subresult =Obj.sub(sumresult,2);
int mulresult =Obj.mul(subresult,2);
int divresult =Obj.div(mulresult,2);

}