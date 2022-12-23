package py.com.jcqa.javabackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.com.jcqa.javabackend.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
