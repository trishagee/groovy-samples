class Groovy3Test extends GroovyTestCase {
    void testJavaDoWhile() {
        def count = 5
        do {
            println "count = $count"
        } while (count-- > 0)
    }

    void testJavaForLoop() {
        def facts = []
        def count = 5
        for (int fact = 1, i = 1; i <= count; i++, fact *= i) {
            facts << fact
        }
        assert facts == [1, 2, 6, 24, 120]
    }


}
