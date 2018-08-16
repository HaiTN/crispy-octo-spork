package com.nba.draft.drafttool.jparepository;

import com.nba.draft.drafttool.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayerJpaRepository extends JpaRepository<Player, Long> {
}