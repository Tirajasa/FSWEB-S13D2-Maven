package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(102));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-28));
        System.out.println(numberToWords(55));
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();// "121"=> ['1','2','1']
        String reversed = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed = reversed + digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(num));

        //long way of mine=)
//        int numa=Math.abs(num);
//        String number = String.valueOf(numa);
//        String[] numbers = number.split("");
//
//        for (int i = 0; i < numbers.length/2; i++) {
//
//           for(int j=numbers.length-1; j>numbers.length/2;j--) {
//               if (!(numbers[i].equals(numbers[j]))) {
//                   return false;
//               }
//
//           }
//           }
//            return true;
//        }

    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) {
            return false;
        }
        int bolenlerinToplami = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                bolenlerinToplami = bolenlerinToplami + i;

            }
        }
        return bolenlerinToplami == num;
    }

    //
//
//
//
//
    public static String numberToWords(int num) {
        if (num < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();
    }
}
//        int[] numbers={0,1,2,3,4,5,6,7,8,9};
//        String [] numa={"sifir","bir","iki","uc","dort","bes","alti","yedi","sekiz","dokuz"};
//        int numI=Integer.parseInt(numS);
//        for(int i=0;i<numbers.length;i++){
//           for(int j=0;j<numa.length;j++){
//              if  (numbers[i].equals(numa[j])){
//                  return numS;
//              }
//           }
//        }
//
//    }









