class Test{  
    public static void main(String args[]){  
        System.out.println("\n Welcome to Java world. This is simple program for testing");  
        Test2 t = new Test2();
        t.testCode1();
        t.testCode2();
        t.testCode3();
        System.out.println("\n Now we are checking Prime Numbers: \n");
        PrimeExample p = new PrimeExample();
        p.checkPrime(1);  
        p.checkPrime(3);  
        p.checkPrime(17);  
        p.checkPrime(20);
    }  
}  
