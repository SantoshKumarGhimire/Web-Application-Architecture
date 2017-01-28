package waa.lab5.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("tableData")
@SessionScoped
public class TableData implements Serializable {
	Name item = new Name();
	private List<Name> names = new ArrayList<>();

	public TableData() {
		names.add(new Name("William", "Dupont"));
		names.add(new Name("Anna", "Keeney"));
		names.add(new Name("Mariko", "Randor"));
		names.add(new Name("John", "Wilson"));
	}

	public List<Name> getNames() {
		return this.names;
	}

	public String saveAction() {
		names.forEach((name) -> {
			name.setEditable(false);
		});
		return null;
	}

	public String deleteRowAction(Name nameToDelete) {
		names.remove(nameToDelete);
		return null;
	}

	public Name getItem() {
		return this.item;
	}

	public String addNameAction() {
		names.add(new Name(item.getFirst(), item.getLast()));
		return "index";
	}
}