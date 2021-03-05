package entity;

import javax.persistence.*;

import static entity.RoleUsers.CLIENT;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idusers;

    @Column(name = "nameUser")
    private String nameUser;

    @Column(name = "mailUser")
    private String mailUser;

    @Column(name = "passwordUser")
    private String passwordUser;

    @Column(name = "loginUser")
    private String loginUser;

    @Column(name = "roleUser")
    private String roleUser = "CLIENT";

    public User() {
    }

    public User(String nameUser, String mailUser, String passwordUser, String loginUser) {
        this.nameUser = nameUser;
        this.mailUser = mailUser;
        this.passwordUser = passwordUser;
        this.loginUser = loginUser;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public int getIdusers() {
        return idusers;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "idusers=" + idusers +
                ", roleUser=" + roleUser +
                ", nameUser='" + nameUser + '\'' +
                ", mailUser='" + mailUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", loginUser='" + loginUser + '\'' +
                '}';
    }
}
