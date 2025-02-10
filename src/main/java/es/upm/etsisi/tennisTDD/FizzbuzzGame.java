package es.upm.etsisi.tennisTDD;

public class FizzbuzzGame {


    public String execute(Integer i) {
        try{
            Integer.valueOf(i);
        }catch (Exception e){
            throw new NullPointerException("Invalid number");
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "Fizzbuzz";
        }
        else if (i % 3 == 0) {
            return "Fizz";
        }
        else if (i % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
