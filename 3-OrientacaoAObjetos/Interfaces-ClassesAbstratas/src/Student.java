public class Student implements iSkillful {
  public boolean intern;
    private String language;
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public int yearsToGraduate() {
        int years = 2;
        if (intern) {
            years = 1;
        }
        return years;
    }
}
