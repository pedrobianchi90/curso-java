public interface iSkillful {
  String getLanguage();
    
    default String mainSkill() {
        return "Learn " + getLanguage();
    }
}