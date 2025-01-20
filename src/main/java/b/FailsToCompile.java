package b;

public class FailsToCompile {

    public void method(Outer outer) {
        outer.inner().trigger();
    }

}
