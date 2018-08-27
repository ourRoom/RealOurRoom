package ourRoom.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ourRoom.model.Project;


@Repository
public interface ProjectDao extends JpaRepository<Project, Integer>{
	
	Project findByPNum(int pNum);
	
}
