package java进阶.TakeaWay;
import java.time.LocalDateTime;
public class User {
    private String uID;
    private String uname;
    private String usex;
    private String upwd;
    private String uadress;
    private String utel;
    private LocalDateTime utime;

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String uID, String uname, String usex, String upwd, String uadress, String utel, LocalDateTime utime) {
        super();
        this.uID = uID;
        this.uname = uname;
        this.usex = usex;
        this.upwd = upwd;
        this.uadress = uadress;
        this.utel = utel;
        this.utime = utime;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUadress() {
        return uadress;
    }

    public void setUadress(String uadress) {
        this.uadress = uadress;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public LocalDateTime getUtime() {
        return utime;
    }

    public void setUtime(LocalDateTime utime) {
        this.utime = utime;
    }

    @Override
    public String toString() {
        return "User [uID=" + uID + ", uname=" + uname + ", usex=" + usex + ", upwd=" + upwd + ", uadress=" + uadress
                + ", utel=" + utel + ", utime=" + utime + "]";
    }

}
