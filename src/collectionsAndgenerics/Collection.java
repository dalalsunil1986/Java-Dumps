package collectionsAndgenerics;

import java.util.HashMap;
import java.util.Set;

public class Collection {
	HashMap props = new HashMap();
	props.put("key45", "some value");
	props.put("key12", "some other value");
	props.put("key39", "yet another value");
	Set s = props.keySet();
	// insert code here
}
/*What, inserted at line 39, will sort the keys in the props HashMap?
A. Arrays.sort(s);
B. s = new TreeSet(s);
C. Collections.sort(s);
D. s = new SortedSet(s);
Answer: B
*/