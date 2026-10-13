package tn.esprit.autoloc.repository;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository <Agent, Integer> {}
