package com;

import java.util.function.Function;

public class MainJava {

    public String test1() {
        return "result";
    }

    public String test2() {
        return "result";
    }

    public Function<String, String> test3() {
        return (t) -> "result";
    }

    public String test4() {
        return test3().apply("");
    }
}
