package adlifetech.contactUs.repository;

import adlifetech.contactUs.model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Optional;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs,Integer> {
    Optional<ContactUs> findByEmailAndCreatedAt(String email, Timestamp currentTimestamp);

}
