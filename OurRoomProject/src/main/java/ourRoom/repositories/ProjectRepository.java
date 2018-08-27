package ourRoom.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ourRoom.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	
	
}
