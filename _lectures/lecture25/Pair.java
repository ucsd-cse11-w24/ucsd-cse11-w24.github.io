class FancyPair<A, B> {
  A a; B b;
  FancyPair(A a, B b) { this.a = a; this.b = b; }
  public String toString() {
    return "Pair(" + this.a + ", " + this.b + ")";
  }
  public boolean equals(Object other) {
    if(!(other instanceof FancyPair)) { return false; }
    @SuppressWarnings("unchecked")
    FancyPair<A, B> p = (FancyPair<A, B>)other;
    return this.a.equals(p.a) && this.b.equals(p.b);
  }
}

class PairMain {
  public static void main(String[] args) {
    FancyPair<Integer, String> p = new FancyPair<>(5, "a");
    System.out.println(p);
    FancyPair<Integer, String> p2 = new FancyPair<>(5, "a");
    System.out.println((p == p2) + " " + p.equals(p2)); 

    System.out.println(p.equals("abc")); 
  }
}

