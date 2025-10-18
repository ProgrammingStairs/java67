// example showing the concept of predicate

import java.util.function.*;
class Demo7 {
    public static void main(String args[]){
        Predicate<Integer> lessThan = i-> i<100;
        System.out.println("lessThan : "+lessThan.test(45));
        System.out.println("lessThan : "+lessThan.negate().test(45));

        Predicate<Integer> greaterThan = i-> i>100;
        System.out.println("greaterThan : "+greaterThan.test(45));

        System.out.println("and : "+lessThan.and(greaterThan).test(45));
        System.out.println("or : "+lessThan.or(greaterThan).test(45));

        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("isEqual : "+str.test("andrew"));
        System.out.println("isEqual : "+str.test("Andrew"));

    }
}
