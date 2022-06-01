// // Java program to illustrate the
// // concept of single inheritance
// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class one {
// 	public void print_geek()
// 	{
// 		System.out.println("Geeks");
// 	}
// }

// class two extends one {
// 	public void print_for() { System.out.println("for"); }
// }
// // Driver class
// public class SingleInheritance {
// 	public static void main(String[] args)
// 	{
// 		two g = new two();
// 		g.print_geek();
// 		g.print_for();
// 		g.print_geek();
// 	}
// }
class Employee {
    void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee { 
// Programmer class inherits from Employee class
    void bonus() {
        System.out.println("Bonus=50000");
    }
}

class SingleInheritance {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    }
}