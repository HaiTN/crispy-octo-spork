//package com.nba.draft.drafttool.elasticrepository;
//
//import com.nba.draft.drafttool.domain.Player;
//import org.springframework.data.elasticsearch.annotations.Query;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import java.util.List;
//
//public interface PlayerElasticRepository extends ElasticsearchRepository<Player, Long> {
//    List<Player> findByFirstName(String firstName);
//
//    @Query("{\"bool\": {\"must\": [{\"match\": {\"player.firstName\": \"?0\"}}]}}")
//    List<Player> findByFirstNameCustomQuery(String firstName);
//}
