package AL.Project.Userservice.repository;

import AL.Project.Userservice.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<user, Long> {

    user findUserByUsernameAndPasseword(String username, String passeword);


}
