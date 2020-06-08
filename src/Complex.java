public class Complex {
    public double real, imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double abs() { return real * real + imag * imag; }

    public Complex sum(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex mul(Complex c) {
        double real = this.real * c.real - this.imag * c.imag;
        double imag = this.real * c.imag + this.imag * c.real;
        return new Complex(real,imag);
    }

    public Complex sopr() { return new Complex(this.real, -this.imag); }
}