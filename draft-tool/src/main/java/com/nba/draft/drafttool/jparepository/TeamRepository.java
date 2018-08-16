package com.nba.draft.drafttool.jparepository;

import com.nba.draft.drafttool.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TeamRepository extends JpaRepository<Team, Long> {
}
