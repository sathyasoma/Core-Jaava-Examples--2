package com.cg.eis.exception;

public class ExceptionPropagationEx {
	 public void method4 ()
	    {
	        int a = 10, b = 0;
	        int c = a / b;
	    }
	    public void method3 ()
	    {
	        this.method4 ();
	        System.out.println ("after method 4 compltion");
	    }
	    public void method2 ()
	    {
	        this.method3 ();
	        System.out.println ("after method 3 compltion");
	    }
	    public void method1 ()
	    {
	        this.method2 ();
	        System.out.println ("after method 2 compltion");
	    }
	    public static void main (String args[])
	    {
	        ExceptionPropagationEx ep = new ExceptionPropagationEx();
	        ep.method1 ();
	        System.out.println ("after method 1 completion");
	    }

}
