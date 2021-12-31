
public class Workshop {
  int id;
  String name,title,qualification,mobnum,email;

    public Workshop() {
    }
  
  
  
    public Workshop(int id, String name, String title, String qualification, String mobnum, String email) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.qualification = qualification;
        this.mobnum = mobnum;
        this.email = email;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getMobnum() {
        return mobnum;
    }

    public void setMobnum(String mobnum) {
        this.mobnum = mobnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
}
