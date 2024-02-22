// Write a generic class Pair that takes two type parameters, A and B,
// and has two fields, a (of type A) and b (of type B)
class Pair<A, B> {
    A a; B b;
    Pair(A a, B b) { this.a = a; this.b = b; }
  
    Pair<B, A> swap() {
      return new Pair<B, A>(this.b, this.a);
    }
  
    // Add an instance method sum to Pair that produces the sum of the a and b fields
    double sum() {
      return this.a + this.b;
    }
  }
  
  class PairExamples {

    Pair<Double, Double> p = new Pair<Double, Double>(4.0, 5.0);
    double result1 = p.sum();

    Pair<String, Integer> p2 = new Pair<String, Integer>("abc", 123);
    double result2 = p.sum();

    Pair<Integer, String> p3 = this.p2.swap();

    // Type inference (this was added around Java 11?)
    Pair<Pair<Double,Double>,Pair<Double,Double>> pair = 
        new Pair<>(
            new Pair<>(1.0, 2.0),
            new Pair<>(3.0, 4.0));

    String[] strs = {"a", "b", "c"};
    Double[] dubz = {1.0, 2.0, 3.0};
    Pair<String[], Double[]> strsdubz = new Pair<>(this.strs, this.dubz);

    /*

    Tweet t = new ReplyTweet(...);
    Tweet[] ts = { new TextTweet(...), new ReplyTweet(...) };
    Pair<Tweet, Tweet[]> tweets = new Pair<>(this.t, this.ts);

    */

  }
  