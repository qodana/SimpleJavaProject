/*
 * MIT License
 *
 * Copyright (c) ${year} Your Name
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.example;

public class FormattingExample {

    // BAD FORMATTING SECTION 1: missing spaces around operators and after commas
    public int add(int a,int b){
        return a+b;
    }
    public void printResult(int x,int y){
        int sum=x+y;
        if(sum>0){
            System.out.println("Positive: "+sum);
        }else{
            System.out.println("Non-positive: "+sum);
        }
    }

    // CORRECTLY FORMATTED SECTION: follows IntelliJ code style
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public String buildMessage(String prefix, String content, int repeat) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(": ");
        for (int i = 0; i < repeat; i++) {
            sb.append(content);
        }
        return sb.toString();
    }

    // BAD FORMATTING SECTION 2: missing spaces around operators and after commas
    public String format(String name,int age){
        return "Name: "+name+", Age: "+age;
    }
    private int calculate(int x,int y,int z){
        return x*y+z;
    }
    public boolean compare(int a,int b){
        return a>b;
    }
}
