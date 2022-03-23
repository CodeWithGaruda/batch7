package class12;

public class Prg1 {
	
	static int swathi(int val) {
		System.out.printf("\nthis is swathi method");
		return val * 10;
	}

	static int bhavith() {
		return 5;
	}

	static void sanath(int fee) {
		System.out.printf("\nthankx for the fee %d", fee);
	}

	static void samp() {
		System.out.printf("this is samp fucnction");
	}
	public static void main(String[] args) {
		System.out.println("function");
		swathi(10);
	}

}
/**
 #include <stdio.h>
int main() {
    printf("Hello world\n");
   samp();
   int a=bhavith();//5
   printf("\nin main %d",bhavith());
   sanath(4000);
   sanath(5000);
   printf("\nin main %d",swathi(10));
    return 0;
}

int swathi(int val){
    printf("\nthis is swathi method");
    return val*10;
}

int bhavith(){
    return 5;
}

void sanath(int fee){
    printf("\nthankx for the fee %d",fee);
}

void samp(){
    printf("this is samp fucnction");
}
 */
