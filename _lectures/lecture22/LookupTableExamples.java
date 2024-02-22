class LookupTable<Contents> {
  String[] ids;
  Contents[] contents;
  LookupTable(String[] ids, Contents[] contents) { this.ids = ids; this.contents = contents; }
  Contents find(String id) {
    for(int i = 0; i < this.ids.length; i += 1) {
       if(this.ids[i].equals(id)) { return this.contents[i]; }
    }
    return null;
  }
  boolean contains(String id) {
    for(int i = 0; i < this.ids.length; i += 1) {
       if(this.ids[i].equals(id)) { return true; }
    }
    return false;
  }
  void update(String id, Contents newValue) {
    for(int i = 0; i < this.ids.length; i += 1) {
       if(this.ids[i].equals(id)) { this.contents[i] = newValue; return; }
    }
    return;
  }
}

// Section code is 456541

// Lots of this was in videos for Friday
class LookupTableExamples {
  // A static method that takes a LookupTable<Double> and an array of strings and returns the sum of all
  // the values for those keys in that table
  static double sumOfIds(LookupTable<Double> table, String[] ids) {
      // Loop over the ids to add things up (using find)
      return 0;
  }


  // A static method that takes a LookupTable<T> and an array of strings and returns the count of those strings
  // that are present as ids in the lookup table
  static <T> int countIds(LookupTable<T> table, String[] ids) {
    return 0;
  }

  // A static method that takes a LookupTable<T>, an array of strings, and a value T and updates
  // the lookup table so all those ids have the given T value.












}
