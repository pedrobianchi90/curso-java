public class JuniorDeveloper extends Developer {
  public double wage() {
    return 3000.0 + yearsOfExperience * 100;
  }

  public String mainSkill() {
    return language + " Automated tests";
  }

  @Override
  public String getLanguage() {
    return language;
  }
}