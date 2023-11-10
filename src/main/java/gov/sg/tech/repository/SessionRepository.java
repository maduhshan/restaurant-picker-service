package gov.sg.tech.repository;

import gov.sg.tech.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Session findByIdAndUsers_Id(Long sessionId, Long userId);
}
