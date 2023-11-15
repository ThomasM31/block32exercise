package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 3: For more challenge!
//  Implement this interface. An object of this type should represent a
//  function with some arbitrary parameter type T and arbitrary return type R.
//  The interface should have the methods apply(), which applies the
//  represented function to an argument of the correct type;
//  and compose(), which takes another Function as argument, and composes
//  "this" function with that other function. Make sure that the return type
//  of the other function matches the expected argument type of this function.
//  .
//  Hint: To solve this task, you need to use type parameters on both the
//  interface itself, *and* on one of its methods.
public interface Function<R,T> {
    R apply(T param);
    // TODO task 5: For even more challenge, really tricky!
    //  Give the compose() function a default implementation.
    R compose(T param);
}
class funcApp implements Function<Double,Double> {
    public Double apply(Double param) {
        return null;  
    }

    public Double compose(Double param) {
        return null;
    }

}