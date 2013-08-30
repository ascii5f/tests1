package com.src.pkg;

import java.util.ArrayList;

public interface IMapper {
	public boolean addNew(String email, boolean state);
	public ArrayList <EmailObject> getAll();
	public ArrayList <EmailObject> getByFilter(boolean filter);
}
