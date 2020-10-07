package org.dao;

import java.util.List;
import org.hcl.Employee;



public interface DBDao {
boolean insert(Employee emp);
boolean delete(String name);
Employee get(String name);
List<Employee> getAll();
}
