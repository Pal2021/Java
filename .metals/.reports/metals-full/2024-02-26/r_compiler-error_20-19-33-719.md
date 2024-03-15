file:///C:/Users/prash/Desktop/Java/GUI/gui3.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/prash/Desktop/Java/GUI/gui3.java
text:
```scala
import java.awt.*;
import javax.swing.*;

public class gui3 {
    static JButton prev, next;
    static CardLayout cl;
    static JPanel p;
    static JComboBox<String> jcb;

    public static void main(String[] sj) {
        JFrame f = new JFrame("My Cards");
        // f.setSize(800, 700);
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        p = new JPanel();
        cl = new CardLayout();
        p.setLayout(cl);
        f.add(p);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED); 
        p.add(p1, "Red");

        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN); 
        p.add(p2, "Green");

        JPanel p3 = new JPanel();
        p3.setBackground(Color.YELLOW); 
        p.add(p3, "Yellow");

        JPanel p4 = new JPanel();
        p4.setBackground(Color.BLUE); 
        p.add(p4, "Blue");

        f.setVisible(true);
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcSyntheticDecorationsProvider.<init>(PcSyntheticDecorationProvider.scala:37)
	scala.meta.internal.pc.ScalaPresentationCompiler.syntheticDecorations$$anonfun$1(ScalaPresentationCompiler.scala:120)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator