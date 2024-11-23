package collectionConceptsPart02;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	enum Lang {
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
	}

	public static void main(String[] args) {

		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);

		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);

		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumRange);

		EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
		System.out.println(CSharpEnum);

		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.RUBY);
		System.out.println(multipleEnum);

		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JAVASCRIPT);
		lang2.addAll(lang1);
		System.out.println(lang2);

		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);

		Iterator<Lang> it = fullLang.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.println(" , ");
		}

		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);

		boolean b = newLang.remove(Lang.CSHARP);
		System.out.println(b);
		System.out.println(newLang);

		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1);
		System.out.println(newLang);
	}
}