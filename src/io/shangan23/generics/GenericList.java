package io.shangan23.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

	List<String> detail;

	public List<String> getDetail() {
		return detail;
	}

	public void setDetail(List<String> detail) {
		this.detail = detail;
	}

	public void listDemo() {
		List<String> lst = new ArrayList<String>();
		lst.add("FirstList");
		lst.add("SecondList");
		lst.add("ThirdList");
		lst.add("FourthList");
		setDetail(lst);

		Iterator<String> itr = getDetail().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void listDemoAllTypes() {
		List lst = new ArrayList();
		lst.add("FirstList");
		lst.add("SecondList");
		lst.add(23);
		lst.add('A');
		setDetail(lst);

		Iterator<String> itr = getDetail().iterator();
		while (itr.hasNext()) {
			Object s = itr.next();
			if(s instanceof String) {
				String data = (String)s;
				System.out.println(data);
			}else if(s instanceof Integer) {
				Integer data = (Integer)s;
				System.out.println(data);
			}else if(s instanceof Character) {
				Character data = (Character)s;
				System.out.println(data);
			}else
				System.out.println(itr.next());
		}
	}

}
