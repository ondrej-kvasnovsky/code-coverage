package com

class MainGroovy {

    def test1() {
        "result"
    }

    def test2() {
        return "result"
    }

    def test3() {
        return {
            "result"
        }
    }

    def test4() {
        test3()()
    }
}
