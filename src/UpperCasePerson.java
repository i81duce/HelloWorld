public class UpperCasePerson extends Person {
    @Override
    public void setName(String name){
        super.setName(name.toUpperCase());
    }
}
