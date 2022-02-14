package AL.Project.Userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class user {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
 private long Id;
 private String username;
 private String passeword;


    public String getPasseword() {
        return passeword;
    }

    public void setPassword(String passeword) {
        this.passeword = passeword;
    }
}
