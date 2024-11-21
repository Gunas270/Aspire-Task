package Naveenya_Practices;
class manager{
	void developer()
{
   System.out.println("Manager can also be developer");	
}
}
class employee extends manager{
	void tester() {
		System.out.println("Employee is a tester");
	}

}

public class inheritance {

	public static void main(String[] args) {
                    employee myEmployee=new employee()
;
                    myEmployee.developer();
                    myEmployee.tester();

	}

}
