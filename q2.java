package project_euler;
public class q2 {
    public static void main(String[] args) {
    	/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

    		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    		By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        do
        {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;

            if (n2 % 2 == 0)
                sum = sum + n2;
        }
        while (n2 < 4000000);

        System.out.println(sum);
    }
}
