class Complex implements Cloneable, Comparable<Complex> {
    
    private double a;
    private double b;
    
    public Complex() {
        this(0,0);
    }
    
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public Complex(double a) {
        this(a,0);
    }
    
    public Complex add(Complex complex) {
        double c = complex.getRealPart();
        double d = complex.getImaginaryPart();
        Complex r = new Complex(a + c, b + d);
        return r;
    }
    
    public Complex subtract(Complex complex) {
        double c = complex.getRealPart();
        double d = complex.getImaginaryPart();        
    Complex r = new Complex(a - c, b - d);
        return r;
    }

    public Complex multiply(Complex complex) {
        double c = complex.getRealPart();
        double d = complex.getImaginaryPart();         
        double real = 0;
        double imaginary = 0;
        real = (a * c) - (b * d);
        imaginary = (b * c) + (a * d);
        Complex r = new Complex(real, imaginary);
        return r;
    }
        
    public Complex divide(Complex complex) {
        double c = complex.getRealPart();
        double d = complex.getImaginaryPart();         
        double real = 0;
        double imaginary = 0;
        real = ((a * c) + (b * d)) / ((Math.pow(c, 2) + Math.pow(d, 2)));
        imaginary = ((b * c) - (a * d)) / ((Math.pow(c, 2) + Math.pow(d, 2)));
        Complex r = new Complex(real, imaginary);
        return r;
    }        
    
    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }   
    
    public double getRealPart() {
        return a;
    }
    
    public double getImaginaryPart() {
        return b; 
    }
    
    @Override 
    public int compareTo(Complex complex) {
        int value = 0;
        
        if (this.abs() > complex.abs()) value = 1;
        else if (this.abs() < complex.abs()) value = -1;
        else value = 0;
        return value;
    }
    
    @Override
    public Complex clone() {
        return new Complex(a,b);
    }
    
    @Override
    public String toString() {
        return a + " + " + b + "i";
    }
}
